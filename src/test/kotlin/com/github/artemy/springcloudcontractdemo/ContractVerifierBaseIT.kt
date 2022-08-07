package com.github.artemy.springcloudcontractdemo

import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.junit.jupiter.api.BeforeEach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.web.context.WebApplicationContext


@SpringBootTest(webEnvironment = RANDOM_PORT)
class ContractVerifierBaseIT {
    @Autowired
    lateinit var context: WebApplicationContext

    @BeforeEach
    fun setup() {
        RestAssuredMockMvc.webAppContextSetup(context)
    }
}
