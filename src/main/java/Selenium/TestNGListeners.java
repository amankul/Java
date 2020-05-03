package Selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {

        System.out.println("**********TEST STARTED************" + iTestResult.getName());

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

        System.out.println("**********TEST SUCCESSFUL************" + iTestResult.getName());

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        System.out.println("**********TEST FAILED************" + iTestResult.getName());

        // take screenshots or rerun

    }


    public void onTestSkipped(ITestResult iTestResult) {

        System.out.println("**********TEST SKIPPED************" + iTestResult.getName());

    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }


    public void onStart(ITestContext iTestContext) {

    }


    public void onFinish(ITestContext iTestContext) {

        System.out.println("**********TEST FINISHED************" + iTestContext.getName());

    }
}

/*
Listeners are interfaces that keep track of test execution and help peform action during multiple stages of execution
 */