/* Copyright 2023 Jimmy Fennelly */
package com.jftech.reddit.scraper.api.controllers;

import com.jftech.reddit.scraper.api.entities.RedditThread;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/scraper")
@RequiredArgsConstructor
public class CampaignController {

    @PostMapping("/campaign")
    public ResponseEntity<RedditThread> createCampaign() {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/campaign/{id}")
    public ResponseEntity<RedditThread> getCampaign(@PathVariable String id) {
        return ResponseEntity.ok(null);
    }

    @PutMapping("/campaign/{id}")
    public ResponseEntity<RedditThread> updateCampaign(@PathVariable String id) {
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/campaign/{id}")
    public ResponseEntity<RedditThread> deleteCampaign(@PathVariable String id) {
        return ResponseEntity.ok(null);
    }
}
