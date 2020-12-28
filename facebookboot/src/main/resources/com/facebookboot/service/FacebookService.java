package com.facebookboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebookboot.dao.FacebookDAOInterface;
import com.facebookboot.entity.FacebookUser;

@Service
public class FacebookService implements FacebookServiceInterface{
	@Autowired
	private FacebookDAOInterface fd;
	@Override
	public FacebookUser createProfileService(FacebookUser fu) {
		return fd.save(fu);
	}
	@Override
	public FacebookUser deleteProfileService(Long uid) {
		fd.deleteById(uid);
		return null;//me ali tuza phone bzy ahe...ata tuza busy ahe kr call
	}
	@Override
	public FacebookUser editProfilefacebookService(FacebookUser fu, String uid) {
		return fd.save(fu);
	}
	@Override
	public FacebookUser viewProfileService(Long uid) {
	return fd.findById(uid).get();
	
	}
	@Override
	public List<FacebookUser> searchProfileFacebookService(String name) {
	List<FacebookUser> list=new ArrayList<>();
	list=fd.findByName(name);
	return list;
	}
	@Override
	public List<FacebookUser> viewAllProfilefacebookService() {
	List<FacebookUser> list=new ArrayList<>();
	fd.findAll().forEach(list1->list.add(list1));
	return list;
	}
	

}
