
plugins {
    kotlin("jvm") version embeddedKotlinVersion
}

repositories { mavenCentral() }

dependencies {
    implementation(kotlin("scripting-common"))
    implementation(kotlin("scripting-jvm"))
    implementation(kotlin("scripting-jvm-host"))
    implementation(project(":script-definition")) // the script definition module
}