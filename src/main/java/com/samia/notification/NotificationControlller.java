package com.samia.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NotificationControlller {
    @Autowired
    private Schedule schedule;

    @Autowired
    private EmailSending emailSending;

    @Autowired
    private Configs configs;

    @GetMapping("/")
     public String helloWorld() {
         return "hello";
     }

}
