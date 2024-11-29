package com.server.testonly

import spock.lang.Specification

class TestonlyModuleServerTest extends Specification {

    def "TestonlyModuleServerTest test" () {
        given:
        Integer value = 1

        when:
        value = 3

        then:
        assert value == 3
    }

}
