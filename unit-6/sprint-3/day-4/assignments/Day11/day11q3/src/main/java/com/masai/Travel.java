package com.masai;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("t")
@Scope("prototype")
public class Travel {
	
private Vehicle vehicle;
	
	@PostConstruct
	public void setUp() {
		
		System.out.println("inside setup method");
		
		
	}
	
	
	@PreDestroy
	public void destroy() {
		
		System.out.println("inside destroy method");
	}
	
	

	public void journey() {
		vehicle.go();
		System.out.println("journey started..!");
		
	}


	@Autowired
	@Qualifier("bike")
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}



}
