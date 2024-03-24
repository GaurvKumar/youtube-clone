package com.programming.demo.youtubeclone.repository;

import com.programming.demo.youtubeclone.models.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video, String> {
}
