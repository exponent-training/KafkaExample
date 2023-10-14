package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
