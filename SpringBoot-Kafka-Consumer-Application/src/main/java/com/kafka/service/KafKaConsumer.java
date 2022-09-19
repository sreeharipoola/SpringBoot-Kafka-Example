package com.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.model.User;

@Service
public class KafKaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafKaConsumer.class);

	@KafkaListener(topics = "kafka-topic-2", groupId = "myGroup")
	public void consume(User user) {
		LOGGER.info(String.format("json received -> %s", user));
	}
}
