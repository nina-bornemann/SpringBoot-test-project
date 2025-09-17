## Spring Boot Test Project
A simple Spring Boot project with REST endpoints for testing.

---

### Features
- /api/hello – basic greeting endpoints

> GET /api/hello → "Hello World! :)"  
> GET /api/hello/whatsup → "Whats up?"  
> GET /api/hello/{name} → "Hello {name}"  

- /api/messages – simple in-memory message management 
> GET /api/messages → returns all messages  
> POST /api/messages → add one or more messages   
> DELETE /api/messages/{id} → delete message by ID  

---

### Requirements
Java 24+
Spring Boot