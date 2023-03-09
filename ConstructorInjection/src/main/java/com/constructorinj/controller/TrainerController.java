package com.constructorinj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.constructorinj.entity.Trainer;


//RestController annotation is used to create RESTful web services using Spring MVC
@RestController

public class TrainerController {
	private Trainer tariner;

	public TrainerController(Trainer tariner) {
		super();
		this.tariner = tariner;
	}
	
	@GetMapping("/teach")
	//printing the constructor injection
	public String teach()
	{
		tariner.teach();
		
		return "Training completed sucessfully!";
	}

}


