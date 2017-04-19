package com.example;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        AnalyticsImpl analyticsImpl = new AnalyticsImpl();
        Event event = new Event();
        event.setName("brian");
        event.setAction("birthday!");
        event.setAt(LocalDateTime.now());
        System.out.println(analyticsImpl.addEvent(event));
    }
}
