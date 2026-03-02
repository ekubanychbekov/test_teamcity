import jetbrains.buildServer.configs.kotlin.BuildType
import jetbrains.buildServer.configs.kotlin.DslContext
import jetbrains.buildServer.configs.kotlin.buildSteps.script

object CompanyBBuild : BuildType({
    id("CompanyB_Build")
    name = "Build Company B"
    vcs {
        root(DslContext.settingsRoot)
    }
    steps {
        script {
            name = "Run Company B Build"
            scriptContent = """
                echo "Building Company B"
                cat company-b.conf
            """.trimIndent()
        }
    }
    triggers {

    }
})
