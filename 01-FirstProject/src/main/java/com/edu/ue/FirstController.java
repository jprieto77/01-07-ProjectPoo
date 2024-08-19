package com.edu.ue;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {
	
	
	
	@GetMapping(value="restar/{num1}/{num2}")
	public double getSubtract(@PathVariable("num1")double number1,
			@PathVariable("num2") double number2) {
		
		return number1- number2;
	}
	
	@GetMapping(value="sumar")
	public double getAdd(@RequestParam("number1") double num1, 
			@RequestParam("number2") double num2) {
		
		return num1 + num2;
	}
	
	@RequestMapping(value="sumar2", method = RequestMethod.GET)
	public double getAdd2(@RequestParam("number1") double num1, 
			@RequestParam("number2") double num2) {
		
		return num1 + num2;
	}
	@GetMapping(value="saludar", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getSaludar() {/
		
		return "Hola, ¿como esta?";
	}
	

}
