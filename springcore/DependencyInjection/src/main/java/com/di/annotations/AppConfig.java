package com.di.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.di.annotations")
public class AppConfig {
//	@Bean // (name = "clz")
//	College getCollege() {
//		return new College("snsc", "mnr", 500);
//	}
}
