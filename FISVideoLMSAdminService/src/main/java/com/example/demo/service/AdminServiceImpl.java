package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AdminRepository;
import com.example.demo.entity.Admin;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository repo;
	
	@Override
	public Admin addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return repo.save(admin);
	}
	@Override
	public List<Admin> getAllMovie() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public Admin updateMovie(Admin admin) {
		// TODO Auto-generated method stub
		return repo.save(admin);
	}
	@Override
	public String deleteMovie(int id) {
		// TODO Auto-generated method stub
	this.repo.deleteById(id);
	return "Movie deleted";
	}
	@Override
	public List<Admin> searchMovieByRating(int rate) {
		// TODO Auto-generated method stub
		return repo.searchMovieByRating(rate);
	}
	@Override
	public List<Admin> searchMovieByLeadActor(String name) {
		// TODO Auto-generated method stub
		return repo.searchMovieByLeadActor(name);
	}
	

}
