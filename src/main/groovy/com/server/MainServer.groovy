package com.server

import groovy.util.logging.Slf4j
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication

import javax.annotation.PostConstruct
import java.time.Instant

@Slf4j
@SpringBootApplication
@EnableAutoConfiguration
class MainServer {

    @PostConstruct
    void init(){
        log.info ("Setting system timezone to UTC...")
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"))
        log.info ("Current system timezone is now ${TimeZone.default}")
        log.info ("Current system time is ${Instant.now()}")
    }

    static void main(String[] args) {
        SpringApplication.run (MainServer, args)
    }
}
