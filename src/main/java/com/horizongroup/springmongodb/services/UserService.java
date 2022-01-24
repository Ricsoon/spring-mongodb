package com.horizongroup.springmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horizongroup.springmongodb.domain.User;
import com.horizongroup.springmongodb.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	public UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
