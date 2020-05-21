package io.sample.kafka.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.sample.kafka.producer.SimpleProducer;

@RestController
@RequestMapping("producer")
public class Controller {

	@Autowired
	private SimpleProducer simpleProducer;

	@GetMapping(value = "/sendMessage")
	public void sendMessageToKafka(@RequestParam(value = "message") String message) {
		this.simpleProducer.sendMessage(message);
	}
}
