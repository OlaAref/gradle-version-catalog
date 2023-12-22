package com.olaaref.version.catalog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VersionCatalogApplication

fun main(args: Array<String>) {
	runApplication<VersionCatalogApplication>(*args)
}
