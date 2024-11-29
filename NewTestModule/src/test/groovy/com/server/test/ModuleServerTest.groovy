package com.server.test

import spock.lang.Specification

class ModuleServerTest extends Specification {

    def "ModuleServerTest test" () {
        given:
        Integer value = 1

        when:
        value = 3

        then:
        assert value == 3
    }

}
