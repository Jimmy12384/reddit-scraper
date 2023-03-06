/* Copyright 2023 Jimmy Fennelly */
package com.jftech.reddit.scraper.api.entities;

import jakarta.persistence.Column;
import java.time.Instant;
import lombok.Data;

@Data
class TemporalEntity {
    @Column(name = "created_by_timestamp")
    Instant createdByTimeStamp;
}
