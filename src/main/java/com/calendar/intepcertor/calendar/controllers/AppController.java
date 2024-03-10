package com.calendar.intepcertor.calendar.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class AppController {

    @GetMapping("/foo")
    public ResponseEntity<?> foo(HttpServletRequest request){
        Map<String, Object> data = new HashMap<>();
               data.put("title", "Bienvenidos al sistema de atencion al cliente");
        data.put("time", new Date());
        data.put("message", request.getAttribute("message"));
        return ResponseEntity.ok(data);
    }
}
