plugins {
    java
    id("com.github.johnrengelman.shadow") version("7.1.1")
}

java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
    maven("https://repo.codemc.org/repository/nms/")
    maven("https://oss.sonatype.org/content/groups/public/")

}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.8.8-R0.1-SNAPSHOT")
    compileOnly("net.md-5:bungeecord-chat:1.8-SNAPSHOT")
    implementation("org.jetbrains:annotations:23.0.0")
}

tasks {
    shadowJar {
        relocate("org.jetbrains", "me.jonakls.libs.jetbrains")
        minimize()
    }
}