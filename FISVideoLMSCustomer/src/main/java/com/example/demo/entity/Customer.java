package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer{
	
	@Id
	int customer_id;
	String customer_name;
	int contact_no;
	String contact_address;
	String date_of_registration;
	int age;
	String movie_type ;
	String lead_actor1;
	int rating;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int customer_id, String customer_name, int contact_no, String contact_address,
			String date_of_registration, int age, String movie_type, String lead_actor1, int rating) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.contact_no = contact_no;
		this.contact_address = contact_address;
		this.date_of_registration = date_of_registration;
		this.age = age;
		this.movie_type = movie_type;
		this.lead_actor1 = lead_actor1;
		this.rating = rating;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public int getContact_no() {
		return contact_no;
	}

	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}

	public String getContact_address() {
		return contact_address;
	}

	public void setContact_address(String contact_address) {
		this.contact_address = contact_address;
	}

	public String getDate_of_registration() {
		return date_of_registration;
	}

	public void setDate_of_registration(String date_of_registration) {
		this.date_of_registration = date_of_registration;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMovie_type() {
		return movie_type;
	}

	public void setMovie_type(String movie_type) {
		this.movie_type = movie_type;
	}

	public String getLead_actor1() {
		return lead_actor1;
	}

	public void setLead_actor1(String lead_actor1) {
		this.lead_actor1 = lead_actor1;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	
	
	
}