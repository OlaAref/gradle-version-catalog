import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	alias(libs.plugins.spring.boot)
	alias(libs.plugins.dependency.management)
	alias(libs.plugins.kotlin.jvm)
	alias(libs.plugins.kotlin.plugin.spring)
	alias(libs.plugins.kotlin.plugin.allopen)
	id("maven-publish")
}

group = "com.olaaref"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
//	implementation(libs.spring.boot.starter.web)
	implementation(libs.bundles.spring.boot.bundle)
	implementation(libs.jackson.module.kotlin)
	implementation(libs.jackson.databind)
	implementation(libs.kotlin.reflect)
	implementation(libs.spring.data.redis)

	testImplementation(libs.spring.boot.starter.test)
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
