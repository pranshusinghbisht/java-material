package com.masai;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	
	public static void ride() {
		System.out.println("ride started....");
		}

	@Override
	public void go() {
		ride();
		
	}

}
