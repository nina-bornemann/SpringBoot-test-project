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
    public List<Message> addMessage(@RequestBody List<Message> messages) {
        listOfMessages.addAll(messages);
        return listOfMessages;
    }

    @DeleteMapping("/{id}")
    public List<Message> deleteMessage(@PathVariable String id) {
        listOfMessages. removeIf(Message -> Message.getId().equals(id));
        return listOfMessages;
    }
}
