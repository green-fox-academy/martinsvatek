package com.thereddit.demo.repositories;

import com.thereddit.demo.models.Reddit;
import org.springframework.data.repository.CrudRepository;

public interface RedditRepository extends CrudRepository<Reddit, Long> {
}
