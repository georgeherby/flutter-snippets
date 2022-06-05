import com.intellij.codeInsight.template.TemplateActionContext
import com.intellij.codeInsight.template.TemplateContextType

class FlutterContext protected constructor() : TemplateContextType("FLUTTER", "Flutter") {
    override fun isInContext(templateActionContext: TemplateActionContext): Boolean {
        return templateActionContext.file.name.endsWith(".dart")
    }
}
