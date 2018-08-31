package com.algorithms.fibonacci;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FibonacciApplicationTests {

    @Autowired
    private Fibonacci fibonacci;

    @Test
    public void calculate() {
        long result= fibonacci.calculateNLogNComplexity(0);
        Assert.assertEquals(0,result);
    }

    @Test
    public void calculateNegative() {
        long result= fibonacci.calculateNLogNComplexity(-12);
        Assert.assertEquals(0,result);
    }
    @Test
    public void calculateWithFibonacciNumber() {
        long result= fibonacci.calculateNLogNComplexity(5);
        Assert.assertEquals(5,result);
    }

    @Test
    public void calculateWithUnFibonacciNumber() {
        long result= fibonacci.calculateNLogNComplexity(7);
        Assert.assertEquals(13,result);
    }

    @Test
    public void calculate_On_complexityforOne(){
        long result=fibonacci.calculateOnComplexity(1);
        Assert.assertEquals(1,result);
    }

    @Test
    public void calculate_On_complexityforFive(){
        long result=fibonacci.calculateOnComplexity(5);
        Assert.assertEquals(5,result);
    }

    @Test
    public void calculate_On_WithUnFibonacciNumber() {
        long result=fibonacci.calculateOnComplexity(7);
        Assert.assertEquals(13,result);
    }

    @Test
    public void calculate_On_WithNegative() {
        long result= fibonacci.calculateOnComplexity(-12);
        Assert.assertEquals(0,result);
    }

    @Test
    public void calculate_Logn_complexityforOne(){
        long result=fibonacci.calculateOLogNComplexity(1);
        Assert.assertEquals(1,result);
    }

    @Test
    public void calculate_Logn_complexityforFive(){
        long result=fibonacci.calculateOLogNComplexity(5);
        Assert.assertEquals(5,result);
    }

    @Test
    public void calculate_Logn_WithUnFibonacciNumber() {
        long result=fibonacci.calculateOLogNComplexity(7);
        Assert.assertEquals(13,result);
    }

    @Test
    public void calculate_Logn_WithNegative() {
        long result= fibonacci.calculateOLogNComplexity(-12);
        Assert.assertEquals(0,result);
    }

}
