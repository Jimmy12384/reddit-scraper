/* Copyright 2023 Jimmy Fennelly */
package com.jftech.reddit.scraper.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RedditScraperApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedditScraperApiApplication.class, args);
    }
}
