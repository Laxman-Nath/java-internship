package com.di.annotations;

import org.springframework.stereotype.Service;

@Service
public class MathTeacher implements Teacher{

	@Override
	public void teaching() {
		System.out.println("Teaching Math...........");
		
	}

}
