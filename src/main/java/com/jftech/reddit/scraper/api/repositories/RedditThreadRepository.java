/* Copyright 2023 Jimmy Fennelly */
package com.jftech.reddit.scraper.api.repositories;

import com.jftech.reddit.scraper.api.entities.RedditThread;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedditThreadRepository extends CrudRepository<RedditThread, Long> {}
