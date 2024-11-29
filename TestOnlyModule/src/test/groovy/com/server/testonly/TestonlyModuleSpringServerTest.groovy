package com.server.testonly

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification
import com.server.test.ModuleServer

@ContextConfiguration(classes = ModuleServer.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties="spring.cloud.config.enabled=false")
class TestonlyModuleSpringServerTest extends Specification {

    def "ModuleSpringServerTest 2 test" () {
        given:
        Integer value = 1

        when:
        value = 3

        then:
        assert value == 3
    }

}
