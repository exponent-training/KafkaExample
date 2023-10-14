package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerServiceImpl implements KafkaProducerService{

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private final String TOPIC = "kafkatopic";
	
	@Override
	public void msgProducce(String str) {
		// TODO Auto-generated method stub
		System.out.println("Kafka Data Producing start.");
		kafkaTemplate.send(TOPIC, str);
		System.out.println("Kafka Data Producing end.");
	}

}
