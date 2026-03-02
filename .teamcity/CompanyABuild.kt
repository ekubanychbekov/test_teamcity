import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

object CompanyABuild: BuildType({
    id("CompanyA_Build")
    name = "Build Company A"
    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        script {
            name = "Run Company A Build"
            scriptContent = """
                echo "Building Company A"
                cat company-a.conf
            """.trimIndent()
        }
    }

    triggers{

    }
})