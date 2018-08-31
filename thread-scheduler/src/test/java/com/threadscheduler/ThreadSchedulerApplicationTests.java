package com.threadscheduler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ThreadSchedulerApplicationTests {


    @Autowired
    private Schedular schedular;

    @Test
    public void contextLoads() {
        schedular.runThreads();
    }

}
