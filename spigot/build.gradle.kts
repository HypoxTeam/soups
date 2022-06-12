plugins {
    java
    id("com.github.johnrengelman.shadow") version("7.1.1")
}

repositories {
    mavenCentral()
    maven("https://repo.codemc.org/repository/nms/")
    maven("https://oss.sonatype.org/content/groups/public/")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.8.8-R0.1-SNAPSHOT")
    compileOnly("net.md-5:bungeecord-chat:1.8-SNAPSHOT")

    implementation("com.google.inject:guice:4.0")
    implementation("fr.mrmicky:fastboard:1.2.0")
    implementation(project(":api"))
}

tasks {
    processResources {
        expand(
            "name" to rootProject.name,
            "version" to version,
            "description" to description
        )
    }

    clean {
        delete("${rootDir}/bin/")
    }

    shadowJar {

        archiveBaseName.set("SoupsKits")
        destinationDirectory.set(file("$rootDir/bin/spigot/"))
        minimize()

        relocate("com.google.inject", "me.jonakls.libs")
        relocate("fr.mrmicky", "me.jonakls.libs")
    }
}