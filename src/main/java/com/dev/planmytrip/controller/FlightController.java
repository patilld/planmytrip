package com.dev.planmytrip.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

    @GetMapping("/filght")
    public ResponseEntity<?> getFlight() {

        return new ResponseEntity<>("Flights are under maintenance", HttpStatus.OK);
    }

    @PostMapping("/filght")
    public ResponseEntity<?> saveFlight() {

        return new ResponseEntity<>("Flights are under maintenance", HttpStatus.ACCEPTED);
    }


}
