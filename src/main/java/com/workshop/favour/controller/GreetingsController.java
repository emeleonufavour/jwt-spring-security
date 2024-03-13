package com.workshop.favour.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class GreetingsController {

    @GetMapping
    public ResponseEntity<String> hello() {
        String hello = " Helloooo";
        return ResponseEntity.ok(hello);
    }

    @GetMapping("/bye")
    public ResponseEntity<String> goodBye() {
        String bye = "Good bye";
        return ResponseEntity.ok(bye);
    }

}
