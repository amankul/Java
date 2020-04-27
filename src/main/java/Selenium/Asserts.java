package Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*x ASSERT(fail n halt)  vs VERIFY(ignore fail and continue) */

public class Asserts {


    @Test
    /* Hard assert throws exception on failure and moves on next @test, but next steps are not executed. Used for critical tests.
    If exception is caught then test is marked as PASS
     */
    static public void hatest(){

        try{

            Assert.assertTrue(false,"ALARM HARD 1");
            System.out.println("HARD Assertion Failed");

            Assert.assertFalse(1<0,"ALARM HARD 2");
            System.out.println("HARD Assertion Passed");

        } catch(AssertionError ae){
            ae.printStackTrace();
        }
    }



    @Test
     /* Soft assert or verify does not throw exception on failure so test not aborted.
    Assert all collates all exceptions and fails test if at least one failure - Only one instance per test should be used.
    If assertAll() not used then all PASS.
     */

    static public void satest(){

        SoftAssert sa= new SoftAssert();

            sa.assertTrue(false,"ALARM SOFT 1");
            System.out.println("SOFT Assertion Failed");

            sa.assertFalse(1<0,"ALARM SOFT 2");
            System.out.println("SOFT Assertion Passed");

        sa.assertAll();


    }


    }

