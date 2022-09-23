package com.example.demo.service;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.AdminDto;


@FeignClient(name="ADMINSERVICE/admin")
public interface FeignProxy {
	
	@GetMapping("/searchMovieByRating/{id}")
	public List<AdminDto> searchMovieByRating(@PathVariable("id") int id);

	@GetMapping("/searchMovieByLeadActor/{name}")
	public List<AdminDto> searchMovieByLeadActor(@PathVariable("name") String name);
	

}