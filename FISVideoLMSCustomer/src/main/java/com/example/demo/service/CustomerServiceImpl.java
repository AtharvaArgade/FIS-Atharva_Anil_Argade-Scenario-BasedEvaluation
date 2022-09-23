package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.entity.AdminDto;
import com.example.demo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired 
	CustomerRepository repo;
	
	@Autowired
	FeignProxy proxy;
	
	@Override
	public Customer add(Customer cust) {
		// TODO Auto-generated method stub
		return repo.save(cust);
	}

	@Override
	public List<Customer> getAllCust() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Customer update(Customer cust) {
		// TODO Auto-generated method stub
		return repo.save(cust);
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Customer Deleted";
	}


	@Override
	public List<AdminDto> findMovieByRating(int id) {
		// TODO Auto-generated method stub
		return proxy.searchMovieByRating(id);
	}

	@Override
	public List<AdminDto> findMovieByLeadActor(String name) {
		// TODO Auto-generated method stub
		return proxy.searchMovieByLeadActor(name);
	}

}
