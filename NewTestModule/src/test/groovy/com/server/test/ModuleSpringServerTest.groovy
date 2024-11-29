package com.server.test

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(classes = ModuleServer.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties="spring.cloud.config.enabled=false")
class ModuleSpringServerTest extends Specification {

    def "ModuleSpringServerTest test" () {
        given:
        Integer value = 1

        when:
        value = 3

        then:
        assert value == 3
    }

}
