plugins {
    kotlin("jvm") version "2.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.freemarker:freemarker:2.3.31")
    implementation("io.pebbletemplates:pebble:3.1.5")
    implementation("com.github.spullara.mustache.java:compiler:0.9.7")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}