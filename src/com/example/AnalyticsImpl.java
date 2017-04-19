package com.example;

import com.oracle.tools.packager.Log;

import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by bsheen on 4/18/17.
 */
public class AnalyticsImpl implements Analytics {

    private static final Logger LOGGER = Logger.getLogger("com.example");
    private static Random random = new Random();


    @Override
    public boolean addEvent(Event event) throws InterruptedException {

        long time = System.currentTimeMillis();

        LOGGER.info("starting addEvent method");

        if (event == null) {
            throw new IllegalArgumentException("Event cannot be null");
        }

        if (event.getAction() == null || event.getName() == null || event.getAt() == null) {
            throw new IllegalArgumentException("Event variables cannot be null");
        }

        if (event.getAction().trim().isEmpty() || event.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Event action and name must not be empty");
        }

        Thread.sleep(random.nextInt(3001));

        System.out.println(event);

        time = System.currentTimeMillis() - time;
        LOGGER.info("addEvent method took: " + time + " ms");

        if (random.nextInt(10) == 0) {
            return false;
        }

        return true;
    }

}
