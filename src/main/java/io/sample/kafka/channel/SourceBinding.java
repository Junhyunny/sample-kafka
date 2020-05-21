package io.sample.kafka.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface SourceBinding {

	String OUTPUT_CHANNEL = "output-channel";
	String INPUT_CHANNEL = "input-channel";

	@Output(OUTPUT_CHANNEL)
	MessageChannel outputChannel();

	@Input(INPUT_CHANNEL)
	SubscribableChannel inputChannel();
}
