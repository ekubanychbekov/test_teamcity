import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object CompanyAProject : Project({
    id("CompanyA")
    name = "Company A"
    buildType(CompanyABuild)
})