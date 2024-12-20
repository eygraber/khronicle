enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "khronicle"

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
    }
}

plugins {
    // Provides repositories for auto-downloading JVM toolchains.
    // https://github.com/gradle/foojay-toolchains
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

include(
    "khronicle-android",
    "khronicle-android-lint",
    "khronicle-core",
    "khronicle-ktor-client",
    "khronicle-test",
)
