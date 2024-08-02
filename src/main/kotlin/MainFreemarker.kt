package org.example

import freemarker.template.Configuration
import freemarker.template.TemplateException
import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.io.StringWriter
import java.nio.file.Paths

fun main() {

    // Konfigurasi Freemarker
    val cfg = Configuration(Configuration.VERSION_2_3_31).apply {
        setDirectoryForTemplateLoading(File("src/main/resources"))
        defaultEncoding = "UTF-8"
        logTemplateExceptions = false
        wrapUncheckedExceptions = true
        fallbackOnNullLoopVariable = false
    }

    // Membuat dan mendaftarkan fungsi kustom
    val upperCaseMethod = UpperCaseMethod()
    cfg.setSharedVariable("toUpperCase", upperCaseMethod)

    try {
        // Mengambil template
        val template = cfg.getTemplate("freemarker_template.ftl")

        // Membuat data model
        val items = listOf(
            Item("Item 1", "Value 1", true),
            Item("Item 2", "Value 2", false),
            Item("Item 3", "Value 3", true)
        )
        val dataModel = mapOf("items" to items)

        // Memproses template
        val writer = StringWriter()
        template.process(dataModel, writer)

        // Menulis output ke file baru
        val resourcesPath = Paths.get("src/main/output").toAbsolutePath().toString()
        val outputFile = File(resourcesPath + "/freemarker_output.xml")
        FileWriter(outputFile).use { it.write(writer.toString().trim()) }

        println("Template processed and written to output_complex.xml")

    } catch (e: IOException) {
        println("Error loading template: ${e.message}")
    } catch (e: TemplateException) {
        println("Error processing template: ${e.message}")
    }
}
