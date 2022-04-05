package com.cts;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeBean extends Object {
	
	 private String name;
	 
	 private int age;
	 
	 @Autowired
	 private Address address;
	 
	 //setters and getters method
	 
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public void setAge(int age)
	 {
		 this.age=age;
	 }
	public String getName()
	 {
		 return name;
	 }
	public int getAge()
	 {
		 return this.age;
	 }
	 public void setAddress(Address address)
	 {
		 this.address=address;
	 }
	 public Address getAddress()
	 {
		 return address;
	 }
	 
	  
	  
	 
	  
	 
	 
	

}
