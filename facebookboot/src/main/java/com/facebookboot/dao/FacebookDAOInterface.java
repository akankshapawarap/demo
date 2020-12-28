package com.facebookboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.facebookboot.entity.FacebookUser;

@Repository
public interface FacebookDAOInterface extends JpaRepository<FacebookUser,Long> {
	
	@Query("from com.facebookboot.entity.FacebookUser fu where fu.name=:username")
	public List<FacebookUser> findByName(String username);
}
