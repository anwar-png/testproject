package com.cts;

public class Address {

	private String state;

	private String city;
	
	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	  public String toString()
	  {
		  return state+"  "+city;
	  }
	
}
