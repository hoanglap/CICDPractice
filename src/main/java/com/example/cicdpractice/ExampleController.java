package com.example.cicdpractice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ExampleController {

    @GetMapping
    public ResponseEntity<String> getTest()
    {
        return ResponseEntity.ok("Test Request");
    }

    @GetMapping("/test2")
    public ResponseEntity<String> getTest2()
    {
        return ResponseEntity.ok("Test 2 Request");
    }
}
