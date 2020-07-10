package main.Selenium.ListenAndRerun;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(
        TestNGListenersAndRetry
                .class)       // Listeners at class level. Can also be defined in testng.xml at suite level

public class RerunDemo  {

    @Test
    public  void Test1() {

        System.out.println("normal execution");
    }


    @Test(retryAnalyzer = TestNGListenersAndRetry.class)
    public  void Test2() {

        System.out.println("failed execution");
        Assert.assertTrue(0>1);

    }


    @Test
    public  void Test3() {

        throw new SkipException("skipped test");
    }

}






/*
Listeners are interfaces that keep track of test execution and help peform action during multiple stages of execution
 */