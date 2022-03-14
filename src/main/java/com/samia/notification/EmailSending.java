package com.samia.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmailSending {

    @Autowired
    JavaMailSender javaMailSender;


    public void sendEmail(String who, String what, String text){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("samia.zaboub@javenir84.com");
        simpleMailMessage.setTo(who);
        simpleMailMessage.setSubject(what);
        simpleMailMessage.setText(text);
        this.javaMailSender.send(simpleMailMessage);

    }

}
