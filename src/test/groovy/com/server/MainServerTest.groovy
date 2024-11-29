package com.server

import spock.lang.Specification

class MainServerTest extends Specification {

    def "initial test" () {
        given:
        Integer value = 1

        when:
        value = 3

        then:
        assert value == 3
    }

}
