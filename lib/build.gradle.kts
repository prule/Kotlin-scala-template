/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Scala library project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.8/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the scala Plugin to add support for Scala.
    scala

    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use Scala 2.13 in our library project
    implementation(libs.scala.library)

    // This dependency is used internally, and not exposed to consumers on their own compile classpath.
    implementation(libs.guava)

    // Use Scalatest for testing our library
    testImplementation(libs.junit)
    testImplementation(libs.scalatest.v2.v13)
    testImplementation(libs.junit.v4.v13.v2.v13)

    // Need scala-xml at test runtime
    testRuntimeOnly(libs.scala.xml.v2.v13)

    // This dependency is exported to consumers, that is to say found on their compile classpath.
    api(libs.commons.math3)
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}
