package com.springbootmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/")
	public String getIndex() {
		return "index";
	}
}


// dispatcherServlet(fontController) -> handlermapper ->index
// index->viewResolver->index.html