package main.Selenium.ListenAndRerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListenersAndRetry implements ITestListener, IRetryAnalyzer {

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


    private int retryCount = 0;
    private static final int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }




}

/*
Listeners are interfaces that keep track of test execution and help peform action during multiple stages of execution
 */