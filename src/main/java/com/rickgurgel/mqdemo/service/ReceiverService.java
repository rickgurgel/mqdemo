package com.rickgurgel.mqdemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class ReceiverService {

	Logger log = LoggerFactory.getLogger(ReceiverService.class);

	@JmsListener(destination = "test")
	public void receiveMessage(String message) {
		log.info("Received message: "+message);
	}
}
