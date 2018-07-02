package com.idb.springmvc.dao;

import java.util.List;

import com.idb.springmvc.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
