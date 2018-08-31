package com.threadscheduler;

import org.springframework.stereotype.Component;

@Component
public class Schedular {

    static final int COUNT = 3;
    static final int SLEEP = 5;


    public void runThreads() {

        SimpleThread threads[] = new SimpleThread[COUNT];
        for (int i = 0; i < COUNT; ++i) {
            threads[i] = new SimpleThread(i + 1);
        }

        int index = 0;

        while (true) {
            synchronized (threads[index]) {
                threads[index].notify();
            }
            try {
                Thread.sleep(SLEEP);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            index = (++index) % COUNT;
        }
    }
}