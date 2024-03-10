package com.jn2ser.demoService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jn2ser.demoService.dtos.RequestDemoDTO;
import com.jn2ser.demoService.entities.Demo;
import com.jn2ser.demoService.services.DemoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	private DemoService ser;
	
	@GetMapping
	public ResponseEntity<?> getAllDemos(){
		return ResponseEntity.status(HttpStatus.OK)
				.body(this.ser.getAllDemos())
				;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getDemo(@PathVariable int id){
		return ResponseEntity.status(HttpStatus.OK)
				.body(this.ser.getDemo(id))
				;
	}
	
	@PostMapping
	public ResponseEntity<?> createDemo(@RequestBody RequestDemoDTO dto){
		Demo d = new Demo();
		d.setName(dto.getName());
		d.setAge(dto.getAge());
		
		this.ser.createDemo(d);
		
		return ResponseEntity.status(HttpStatus.OK)
				.body("Demo created successfully !!!")
				;
	}

}
