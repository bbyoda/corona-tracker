package com.dzung.coronatracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CoronaTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoronaTrackerApplication.class, args);
    }

}
