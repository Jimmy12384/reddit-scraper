/* Copyright 2023 Jimmy Fennelly */
package com.jftech.reddit.scraper.api.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(schema = "data", name = "thread")
public class RedditThread extends TemporalEntity {

    @Id
    @Column(name = "thread_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "thread_generator")
    @SequenceGenerator(name = "thread_generator", sequenceName = "thread_seq")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "url")
    private String url;
}
