package com.chat.app.controller;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class chat {
    private Long id;
    private String sender;
    private String content;
}
