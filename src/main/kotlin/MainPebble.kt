package org.example

import com.mitchellbosecke.pebble.PebbleEngine
import com.mitchellbosecke.pebble.loader.ClasspathLoader
import java.io.File
import java.io.FileWriter
import java.io.StringWriter
import java.nio.file.Paths

fun main() {
    // Konfigurasi Pebble
    val loader = ClasspathLoader()
    val engine = PebbleEngine.Builder().loader(loader).build()

    // Mengambil template
    val compiledTemplate = engine.getTemplate("peble_template.peb")

    // Membuat data model
    val items = listOf(
        Item("item 1", "Value 1", true),
        Item("item 2", "Value 2", false),
        Item("item 3", "Value 3", true)
    )
    val context = mapOf("items" to items)

    // Memproses template
    val writer = StringWriter()
    compiledTemplate.evaluate(writer, context)

    // Menulis output ke file baru dengan indentasi rapi
    val resourcesPath = Paths.get("src/main/output").toAbsolutePath().toString()
    val outputFile = File(resourcesPath + "/peble_output.xml")
    FileWriter(outputFile).use { it.write(writer.toString().trimIndent()) }

    println("Template processed and written to output_complex.xml")
}
