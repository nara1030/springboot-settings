package com.eom.profile;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RequiredArgsConstructor
public class ProfileApplication {
    private final OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(ProfileApplication.class, args);
    }

    @PostConstruct
    public void test() {
        orderService.order();
    }

}
