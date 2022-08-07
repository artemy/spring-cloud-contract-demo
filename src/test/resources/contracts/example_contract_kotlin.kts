package contracts

import org.springframework.cloud.contract.spec.ContractDsl.Companion.contract

contract {
    request {
        method = GET
        url = url("/api")
        headers {
            contentType = APPLICATION_JSON
            accept = APPLICATION_JSON
        }
        body = body(
            "foo" to value(consumer(optional(anyOf("FOO", "BAR"))), producer("FOO")),
            "bar" to value(consumer(optional(nonBlank)), producer("FOO"))
        )
    }
    response {
        status = OK
        headers {
            contentType = APPLICATION_JSON
        }
        body = body(
            "foo" to value(consumer("FOO"), producer(optional(anyOf("FOO", "BAR")))),
            "bar" to value(consumer("FOO"), producer(optional(nonBlank)))
        )
    }
}
