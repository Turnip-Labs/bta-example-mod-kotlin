pluginManagement {
    val kotlin_version: String by settings

    repositories {
        gradlePluginPortal()
        maven {
            name = "Fabric"
            url = uri("https://maven.fabricmc.net/")
        }
        maven {
            name = "Jitpack"
            url = uri("https://jitpack.io")
        }
        maven {
            name = "Babric"
            url = uri("https://maven.glass-launcher.net/babric")
        }
        maven {
            name = "SignalumMavenInfrastructure"
            url = uri("https://maven.thesignalumproject.net/infrastructure")
        }
    }

    plugins {
        kotlin("jvm") version kotlin_version
    }
}
