package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService service;
	
	@GetMapping("/movie")
	public List<Admin> getAllDetails()
	{
		return this.service.getAllMovie();
	}
	
	@PostMapping("/add")
	public Admin addMovie(@RequestBody Admin a)
	{
		return this.service.addAdmin(a);
		
	}
	@PutMapping("/update")
	public Admin updatingMovie(@RequestBody Admin admin)

	{
		return this.service.updateMovie(admin);
		
	}
	@DeleteMapping("/delete/{mid}")
	public String deletMovie(@PathVariable("mid")int mid)
	{
		return this.service.deleteMovie(mid);
	}
	
	@GetMapping("/searchMovieByRating/{id}")
	public List<Admin> searchMovieByRating(@PathVariable("id") int id){
		return this.service.searchMovieByRating(id);
	}
	
	@GetMapping("/searchMovieByLeadActor/{name}")
	public List<Admin> searchMovieByLeadActor(@PathVariable("name") String name){
		return this.service.searchMovieByLeadActor(name);
	}
}
