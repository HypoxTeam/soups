plugins {
    java
    id("com.github.johnrengelman.shadow") version("7.1.1")
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}
dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.8.1")
    compileOnly("io.papermc.paper:paper-api:1.17.1-R0.1-SNAPSHOT")

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
        minimize()

        relocate("com.google.inject", "me.jonakls.libs")
        relocate("fr.mrmicky", "me.jonakls.libs")
    }
}