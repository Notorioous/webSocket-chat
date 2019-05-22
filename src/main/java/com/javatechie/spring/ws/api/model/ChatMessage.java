package com.javatechie.spring.ws.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "messages")
public class ChatMessage {

	@Id
	private String id;
	private String content;
	private String sender;
	private MessageType type;

}
