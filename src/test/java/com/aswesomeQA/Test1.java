package com.aswesomeQA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void testAddition() {
        int result = 20 + 10;
        Assert.assertEquals(result, 30);
    }

    @Test
    public void testSubtraction() {
        int result = 20 - 10;
        Assert.assertEquals(result, 10);
    }

    @Test
    public void testMultiplication() {
        int result = 20 * 10;
        Assert.assertEquals(result, 200);
    }

    @Test
    public void testDivision() {
        int result = 20 / 10;
        Assert.assertEquals(result, 2);
    }
}