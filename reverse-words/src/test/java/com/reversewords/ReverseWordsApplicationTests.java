package com.reversewords;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReverseWordsApplicationTests {

    @Autowired
    private ReverseWords reverseWords;

    public ReverseWordsApplicationTests() {
    }

    @Test
    public void testReverseWords() {
        Assert.assertEquals("bak ata Ali",reverseWords.reverse("Ali ata bak"));

    }

}
