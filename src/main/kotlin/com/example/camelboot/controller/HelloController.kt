package com.example.camelboot.controller

import org.apache.camel.CamelContext
import org.apache.camel.impl.DefaultExchange
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(@Autowired val context: CamelContext) {

    @GetMapping
    fun hello(): String {
        val exchange = DefaultExchange(context)
        val producer = context.createProducerTemplate()
        producer.send("direct://hello", exchange)

        if (exchange.exception != null) {
            return "NG"
        }
        return exchange.getIn().getBody(String::class.java)
    }

}