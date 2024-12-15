package com.chat.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ChatMessage {
    private Long id;
    private String sender;
    private String content;
}
