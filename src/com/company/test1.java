package com.company;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("test");
        Reporter.log("testestet");
    }
    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("test");
        Reporter.log("成功");
    }
}
