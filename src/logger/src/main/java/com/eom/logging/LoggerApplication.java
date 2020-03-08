package com.eom.logging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LoggerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoggerApplication.class);

        log.error("error");
        log.warn("warn");
        log.info("info");
        log.trace("trace");
        log.debug("debug");
    }
}
