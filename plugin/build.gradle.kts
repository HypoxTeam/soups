plugins {
    java
    id("com.github.johnrengelman.shadow") version("7.1.1")
}

repositories {
    mavenCentral()
    maven("https://repo.unnamed.team/repository/unnamed-public/")
    maven("https://repo.codemc.org/repository/nms/")
}

dependencies {
    implementation("me.yushust.inject:core:0.4.5-SNAPSHOT")
    implementation("fr.mrmicky:fastboard:1.2.0")
    implementation(project(":api"))

    compileOnly("org.spigotmc:spigot:1.8.8-R0.1-SNAPSHOT")
}