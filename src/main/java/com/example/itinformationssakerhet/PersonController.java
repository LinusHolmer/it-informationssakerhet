package com.example.itinformationssakerhet;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    public ResponseEntity<String> createPerson(@Valid @RequestBody Person person) {
        return ResponseEntity.ok("Person skapad");

    }
}
