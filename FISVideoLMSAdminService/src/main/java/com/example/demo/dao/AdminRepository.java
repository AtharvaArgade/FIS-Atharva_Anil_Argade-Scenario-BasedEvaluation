package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer>{

	@Query("select u from Admin u where u.rating=?1")
	public List<Admin> searchMovieByRating(int rate);
	
	@Query("select u from Admin u where u.lead_actor1=?1")
	public List<Admin> searchMovieByLeadActor(String name);
}
