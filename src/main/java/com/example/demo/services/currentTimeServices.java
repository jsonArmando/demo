package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class currentTimeServices {
    public String getCurrentTimeService(){
        String message ="Hello Test";
        LocalDateTime time = LocalDateTime.now();
        return message.concat(time.toString());

    }
}
