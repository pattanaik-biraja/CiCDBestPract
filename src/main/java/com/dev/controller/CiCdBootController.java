package com.dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class CiCdBootController {
	
	
	@GetMapping("/{name}")
    public ResponseEntity<String> askQuestion(@PathVariable(value = "name") String name) {
      return ResponseEntity.ok("Hey " + name + ", Welcome to CI pipe line..");
    }
}
