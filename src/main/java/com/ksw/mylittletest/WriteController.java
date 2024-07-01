package com.ksw.mylittletest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ksw.service.function.WriteService;

@Controller
public class WriteController {

	@Autowired
	private WriteService writeService;
	
	@GetMapping("/write")
	public String toWritePage() {
		return "write";
	}
	
	@PostMapping("/write")
	public String notewrite() {
		
		
		
		return "redirect:/view";
	}
}
