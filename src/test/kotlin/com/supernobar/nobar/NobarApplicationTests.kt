package com.supernobar.nobar

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(properties = ["spring.config.location=classpath:application-test.yml"])
class NobarApplicationTests {

    @Test
    fun contextLoads() {
    }
}
