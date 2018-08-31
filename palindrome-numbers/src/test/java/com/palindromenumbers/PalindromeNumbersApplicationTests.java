package com.palindromenumbers;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PalindromeNumbersApplicationTests {

    @Autowired
    private Polindrom polindrom;


    @Test
    public void negaTiveTest() {
        boolean result= polindrom.isPolindrom(-123L);
        Assert.assertEquals(false,result);
    }

    @Test
    public void zeroTest() {
        boolean result= polindrom.isPolindrom(0L);
        Assert.assertEquals(false,result);
    }

    @Test
    public void positiveNotPolindrom() {
        boolean result= polindrom.isPolindrom(12354321L);
        Assert.assertEquals(false,result);
    }
    @Test
    public void positivePolindrom() {
        boolean result= polindrom.isPolindrom(1235321L);
        Assert.assertEquals(true,result);
    }
}
