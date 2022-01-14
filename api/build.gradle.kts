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
    implementation("team.unnamed.gui:core:2.3.3-SNAPSHOT")
    compileOnly("org.spigotmc:spigot:1.8.8-R0.1-SNAPSHOT")
}