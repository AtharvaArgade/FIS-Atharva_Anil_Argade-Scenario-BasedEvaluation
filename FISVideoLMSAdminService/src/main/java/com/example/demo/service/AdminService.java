package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Admin;

public interface AdminService {
	
public Admin addAdmin(Admin admin);
public List<Admin> getAllMovie();
public Admin updateMovie(Admin admin);
public String deleteMovie(int id);
public List<Admin> searchMovieByRating(int rate);
public List<Admin> searchMovieByLeadActor(String name);

}
