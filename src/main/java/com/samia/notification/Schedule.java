package com.samia.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Autowired
    private EmailSending emailSending;

   // @Scheduled(cron = "0 0 12 1 * ?") once a month, first day of each month an email will be sent
    @Scheduled(cron = "0 * * ? * *")
    public void scheduling() {
    emailSending.sendEmail("creativegirl@outlook.fr", "Notification pour l'actualisation de  Pole emploi de la part de Samia",
            "Bonjour,\n" +
                    "\n" +
                    "Ceci est un Email de notification, pour te rappeler d'aller sur le site pole emploi et d'actualiser ton profil : du 28 au 15\n" +
                    "\n" +
                    "Merci de t'actualiser pendant cette perdiode\n" +
                    "\n" +
                    "Prends soins de toi\n" +
                    "\n" +
                    "Bisous\n" +
                    "\n" +
                    "Samia.");
    }
}
