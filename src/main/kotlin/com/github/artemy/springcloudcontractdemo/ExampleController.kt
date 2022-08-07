package com.github.artemy.springcloudcontractdemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ExampleController {

    @GetMapping
    fun exampleEndpoint(@RequestBody fooRequest: FooRequest): FooResponse =
        FooResponse(fooRequest.foo, fooRequest.bar)
}
