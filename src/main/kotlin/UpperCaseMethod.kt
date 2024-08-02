package org.example

import freemarker.template.TemplateMethodModelEx
import freemarker.template.TemplateModelException

class UpperCaseMethod : TemplateMethodModelEx {
    @Throws(TemplateModelException::class)
    override fun exec(args: List<*>): Any {
        if (args.size != 1) {
            throw TemplateModelException("Wrong arguments")
        }
        return args[0].toString().toUpperCase()
    }
}
