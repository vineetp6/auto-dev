package cc.unitmesh.ide.webstorm.provider

import cc.unitmesh.devti.prompting.code.TestStack
import cc.unitmesh.devti.provider.TechStackProvider

class JavaScriptTechStackService : TechStackProvider() {
    override fun prepareLibrary(): TestStack {
        return TestStack(mutableMapOf(), mutableMapOf())
    }
}
