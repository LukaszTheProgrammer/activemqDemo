package com.example.activemqdemo;

import org.springframework.jms.annotation.JmsListener;

public class JobEndpoints {
    @JmsListener(destination = "jobQueue")
    public void justDoIt(Job aJob) {
        System.out.println("Doing: "+aJob);
    }
}
