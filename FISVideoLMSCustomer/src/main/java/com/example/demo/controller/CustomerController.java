package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AdminDto;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	private Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/getall")
	public List<Customer> getAllDetails()
	{
		return this.service.getAllCust();
	}
	
	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer cust)
	{
		return this.service.add(cust);
		
	}
	@PutMapping("/updatecustomer")
	public Customer updateCustomer(@RequestBody Customer cust)

	{
		return this.service.update(cust);
		
	}
	@DeleteMapping("/delete/{cid}")
	public String deletMovie(@PathVariable("cid")int cid)
	{
		return this.service.delete(cid);
	}
	
	@GetMapping("/getmoviesByRating/{id}")
	public List<AdminDto> getMovieByRating(@PathVariable("id") int id){
		logger.info("Movies...");
		return service.findMovieByRating(id);
	}

	
	@GetMapping("/getmoviesByLeadActor/{name}")
	public List<AdminDto> getMovieByLeadActor(@PathVariable("name") String name){
		logger.info("Movies...");
		return service.findMovieByLeadActor(name);
	}
	
}
