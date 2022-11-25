import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    application
}

group = "io.rokuko"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.clojars.org")
        name = "Clojars"
    }
}

dependencies {
    // j-interop
    implementation("org.jinterop:j-interop:3.0.0")
    // slf4j
    implementation("org.slf4j:slf4j-api:2.0.4")

    implementation("ch.qos.logback:logback-classic:1.4.5")

    implementation("org.apache.commons:commons-lang3:3.12.0")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}