package com.example.itinformationssakerhet;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RandomIdGenerator {
    public String generateId(){
        return UUID.randomUUID().toString();
    }

}
