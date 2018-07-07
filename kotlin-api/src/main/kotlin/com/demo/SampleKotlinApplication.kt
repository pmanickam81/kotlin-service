package com.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleKotlinApplication

fun main(args: Array<String>) {
    runApplication<SampleKotlinApplication>()
}