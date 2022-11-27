package com.supernobar.nobar

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NobarApplication

fun main(args: Array<String>) {
    runApplication<NobarApplication>(*args)
}
