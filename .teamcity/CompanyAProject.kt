import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object CompanyAProject : Project({
    id("Company A")
    name = "Company A"
    buildType(CompanyABuild)
})