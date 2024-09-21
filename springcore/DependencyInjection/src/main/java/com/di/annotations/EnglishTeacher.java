package com.di.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EnglishTeacher implements Teacher {

	@Override
	public void teaching() {
		System.out.println("Teaching english.........");
		
	}

}
