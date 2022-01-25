package com.horizongroup.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.horizongroup.springmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
	
}
