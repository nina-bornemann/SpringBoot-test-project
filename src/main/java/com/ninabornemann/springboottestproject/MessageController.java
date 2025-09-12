package com.ninabornemann.springboottestproject;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/messages")
public class MessageController {

    List<Message> listOfMessages = new ArrayList<>();

    @GetMapping
    public List<Message> printMessages() {
        return listOfMessages;
    }

    @PostMapping
    public List<Message> addMessage(@RequestBody Message message) {
        listOfMessages.add(message);
        return listOfMessages;
    }

}
