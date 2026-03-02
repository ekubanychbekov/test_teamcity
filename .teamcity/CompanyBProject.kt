import jetbrains.buildServer.configs.kotlin.Project

object CompanyBProject : Project({
    id("CompanyBProject")
    name = "Company B"
    buildType(CompanyBBuild)
})