package com.javatechie.spring.ws.api.repo;

import com.javatechie.spring.ws.api.model.ChatMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatMessageRepository extends MongoRepository<ChatMessage, String> {
}
