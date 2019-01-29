package com.example.demo.controller;

import com.example.demo.services.currentTimeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController

public class currentTimeController {
    @Autowired
    currentTimeServices timeCurrentServices;
    @RequestMapping(value="/currentTime")

    public String getCurrentTime(){
        return timeCurrentServices.getCurrentTimeService();
    }
}
