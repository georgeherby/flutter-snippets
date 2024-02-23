import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun properties(key: String) = project.findProperty(key).toString()

plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.6.21"
    id("org.jetbrains.intellij") version "1.17.2"
}
apply(plugin = "org.jetbrains.intellij")
apply(plugin = "java")
apply(plugin = "idea")

group = "com.herbert.george.flutter-snippets"

var versionString: String = "${properties("version")}-${properties("releaseChannel")}-${properties("iteration")}"

version = versionString

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.12")
}

tasks {
    // Set the JVM compatibility versions
    properties("javaVersion").let {
        withType<JavaCompile> {
            sourceCompatibility = it
            targetCompatibility = it
        }
        withType<KotlinCompile> {
            kotlinOptions.jvmTarget = it
        }
    }
    patchPluginXml {
        version.set(versionString)
        changeNotes.set("Upgrade project to run use Kotlin and the latest IntelliJ plugins and IDEs")
        sinceBuild.set(properties("pluginSinceBuild"))
    }
    publishPlugin {
        channels.set(listOf(properties("releaseChannel")))
        token.set(properties("intellijToken"))
    }
    runPluginVerifier {
        ideVersions.set(
            listOf(
                "IC-221.5591.52",
                "IC-222.2270.31"
            )
        )
        verifierVersion.set("latest")
    }
}

intellij {
    plugins.set(
        listOf("java", "Dart:${properties("dartVersion")}", "io.flutter:${properties("flutterVersion")}")
    )
    version.set(properties("ideaVersion"))
    type.set(properties("ideaType"))
    pluginName.set(properties("pluginName"))
}



