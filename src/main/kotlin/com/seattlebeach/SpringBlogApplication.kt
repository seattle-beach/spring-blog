package com.seattlebeach

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class SpringBlogApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringBlogApplication::class.java, *args)
}
