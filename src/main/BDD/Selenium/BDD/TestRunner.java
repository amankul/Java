package Selenium.BDD;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features =
        "/Users/akulkarni/Documents/phunware-takeaway/workspace-sts-3.7.3.RELEASE/Training/src/main/java/Selenium/BDD/login_with_example.feature",
        
  //      format= {"pretty","html:test-outout/html"},
 //   glue = {"/src/main/java/Selenium/BDD"}
        dryRun = false,
        monochrome = false,
        strict = true
 //       tags = {"@Smoke","~@Regression"}
    )


public class TestRunner {

}



/*
 Define behavior in feature. Entire agile team will contribute. But lenghty as compared to TestNG(TDD).
 Also this can be written even when feature is not dev complete

Feature- the path of the dir containing all feature files
glue - the path of the step definition files. not needed if in same package
dryrun - check static mapping of features with step definition. tests not run if true.
monochrome - display the console output in a proper readable format
format - html, json, junit reporting format outputs
strict =  fail execution if any step is not defined in step definition file. Else ignored.
tags - for grouping test scenarios,  ~ ignores, "@1,@2" does OR, "@1","@2" does AND
 */