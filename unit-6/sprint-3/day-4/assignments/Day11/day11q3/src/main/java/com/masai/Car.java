package com.masai;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	
	public static void start() {
		System.out.println("Car started...");
		}

	@Override
	public void go() {
		start();
		
	}

}

