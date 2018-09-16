package com.banking.service;

import java.util.Map;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;

@Service
public class PrintService {
	
	public Message<?> print(Message<String> message){
		
		MessageHeaders header = message.getHeaders();		
		for( Map.Entry<String, Object> entry : header.entrySet()){
			System.out.println(entry.getKey() +"-->"+ entry.getValue());
		}
		System.out.println(message.getPayload());
		
		return MessageBuilder.withPayload("Activator message...").build();
	}
	
}
