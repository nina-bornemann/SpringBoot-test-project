package com.ninabornemann.springboottestproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Objects;

public class Message {

    private String name;
    private String message;
    private String id;

    public Message(String name, String message, String id) {
        this.name = name;
        this.message = message;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Message{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return Objects.equals(name, message1.name) && Objects.equals(message, message1.message) && Objects.equals(id, message1.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, message, id);
    }
}
