pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
rootProject.name = "flightown"
include(":app")
include(":core:data")
include(":core:presentation:designsystem")
include(":core:presentation:ui")
include(":core:domain:main")
include(":auth:data")
include(":auth:domain")
include(":auth:presentation")
include(":quiz:data")
include(":quiz:presentation")
include(":quiz:domain")
include(":course:presentation")
include(":course:data")
include(":course:domain")
include(":training:data")
include(":training:presentation")
include(":training:domain")
include(":core:database")
