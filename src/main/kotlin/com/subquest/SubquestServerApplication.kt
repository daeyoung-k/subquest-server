package com.subquest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SubquestServerApplication

fun main(args: Array<String>) {
    runApplication<SubquestServerApplication>(*args)
}
