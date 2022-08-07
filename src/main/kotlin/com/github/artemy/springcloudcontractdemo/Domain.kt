package com.github.artemy.springcloudcontractdemo


data class FooRequest(
    val foo: FOO?,
    val bar: String?,
    val baz: String?
)

@Suppress("unused")
enum class FOO {
    FOO,
    BAR
}

data class FooResponse(
    val foo: FOO?,
    val bar: String?,
    val baz: String?
)
