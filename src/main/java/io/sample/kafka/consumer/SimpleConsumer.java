package io.sample.kafka.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

import io.sample.kafka.channel.SourceBinding;

@EnableBinding(value = { SourceBinding.class })
public class SimpleConsumer {

	@StreamListener(target = SourceBinding.INPUT_CHANNEL)
	public void recieveEvent(Message<String> message) {
		System.out.println("### consumer message from broker :" + message);
	}
}
