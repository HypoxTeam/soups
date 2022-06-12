plugins {
    java
    id("com.github.johnrengelman.shadow") version("7.1.1")
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
}
dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.8.1")
    compileOnly("io.papermc.paper:paper-api:1.17.1-R0.1-SNAPSHOT")

    implementation("net.kyori:adventure-text-minimessage:4.11.0") {
        exclude("net.kyori", "adventure-api")
    }
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

    java {
        toolchain.languageVersion.set(JavaLanguageVersion.of(17))
    }

    clean {
        delete("${rootDir}/bin/")
    }

    shadowJar {
        archiveBaseName.set("SoupsKits")
        destinationDirectory.set(file("$rootDir/bin/paper/"))

        relocate("com.google.inject", "me.jonakls.libs")
        relocate("fr.mrmicky", "me.jonakls.libs")
        relocate("org.junit.jupiter", "me.jonakls.test")
        minimize()
    }
}