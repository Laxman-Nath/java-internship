package com.di.annotations;

import org.springframework.stereotype.Component;

@Component(value = "st1")
public class Student {

	public void printData() {
		System.out.println("Name="+"laxman");
		System.out.println("Address="+"mahendranagar");
		
	}
}
