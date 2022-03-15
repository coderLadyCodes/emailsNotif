package com.samia.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NotificationControlller {
    @Autowired
    private Schedule schedule;

    @Autowired
    private EmailSending emailSending;

    @GetMapping("/notifs-emails.herokuapp.com/")
     public String helloWorld() {
         return "hello";
     }

}
