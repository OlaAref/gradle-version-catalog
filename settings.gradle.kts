rootProject.name = "version-catalog"

dependencyResolutionManagement{
    versionCatalogs{
        create("libs"){
            from(files("/libs.versions.toml"))
        }
    }
}
