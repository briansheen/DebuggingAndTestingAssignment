package com.example;

/**
 * Created by bsheen on 4/18/17.
 */
public interface Analytics {
    boolean addEvent(Event event) throws InterruptedException;
}

