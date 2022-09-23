package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.AdminDto;
import com.example.demo.entity.Customer;


public interface CustomerService {

	public Customer add(Customer cust);
	public List<Customer> getAllCust();
	public Customer update(Customer cust);
	public String delete(int id);
	public List<AdminDto> findMovieByRating(int id);
	public List<AdminDto> findMovieByLeadActor(String name);
}
