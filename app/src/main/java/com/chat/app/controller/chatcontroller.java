package com.chat.app.controller;

import lombok.NoArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class chatcontroller {
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")

    public chat sendMessage(chat message){
        return message;


    }
    @GetMapping("chat")
    public String chat(){
        return "chat";
    }
}
