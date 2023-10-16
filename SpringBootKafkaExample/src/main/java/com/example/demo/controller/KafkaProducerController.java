package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.KafkaProducerService;

@RestController
public class KafkaProducerController {
	
	@Autowired
	private KafkaProducerService kafkaProducerService;
	
	@GetMapping(value = "/publish/{msg}")
    public String msgProduce(@PathVariable String msg) {
		System.out.println("Data : " + msg);
		kafkaProducerService.msgProducce(msg);
		return "Publish Successfully";
	}
	
	@PostMapping(value = "/publish")
	public String studentDataProducing(@RequestBody Student student) {
		System.out.println("Check Student Data : " + student);
		kafkaProducerService.studentDataProduce(student);
		return "Student Data Produced";
	}
}
