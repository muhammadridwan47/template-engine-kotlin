package org.example

import com.github.mustachejava.DefaultMustacheFactory
import java.io.File
import java.io.FileWriter
import java.io.StringWriter
import java.nio.file.Paths


fun main() {
    val currentFilePath = Paths.get("src/main/resources/").toAbsolutePath().toString()
    println("Path file saat ini: $currentFilePath")

    val file = File("src/main/resources/")
    val absolutePath = file.absolutePath
    println("Path absolut file: $absolutePath")


    // Membuat data model
    val items = listOf(
        Item("item 1", "Value 1", true),
        Item("item 2", "Value 2", false),
        Item("item 3", "Value 3", true)
    )
    val dataModel = mapOf("items" to items)

    // Konfigurasi Mustache
    val mf = DefaultMustacheFactory()
    val mustache = mf.compile("mustache_template.mustache")

    // Memproses template
    val writer = StringWriter()
    mustache.execute(writer, dataModel).flush()

    // Menulis output ke file baru
    val resourcesPath = Paths.get("src/main/output").toAbsolutePath().toString()
    val outputFile = File(resourcesPath + "/mustache_output.xml")
    FileWriter(outputFile).use { it.write(writer.toString()) }

    println("Template processed and written to output.xml")
}
