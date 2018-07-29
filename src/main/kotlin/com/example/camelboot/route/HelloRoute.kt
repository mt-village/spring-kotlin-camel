package com.example.camelboot.route

import org.apache.camel.builder.RouteBuilder
import org.springframework.stereotype.Component

@Component
class HelloRoute: RouteBuilder() {
    override fun configure() {
        from("direct://hello")
                .setBody(constant("hello, camel"))
    }
}