package com.samia.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NotificationControlller {
    @Autowired
    private Schedule schedule;

    @Autowired
    private EmailSending emailSending;

    @GetMapping("/hello")
     public String helloWorld() {
         return "hello";
     }

}
