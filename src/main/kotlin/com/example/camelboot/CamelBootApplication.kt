package com.example.camelboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CamelBootApplication

fun main(args: Array<String>) {
    runApplication<CamelBootApplication>(*args)
}
