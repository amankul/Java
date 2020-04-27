$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/akulkarni/Documents/phunware-takeaway/workspace-sts-3.7.3.RELEASE/Training/src/main/java/Selenium/BDD/login_with_example.feature");
formatter.feature({
  "comments": [
    {
      "line": 3,
      "value": "# with examples keyword using data driven approach, scenarios becomes scenario outline. similar to dataprovider"
    }
  ],
  "line": 6,
  "name": "Free CRM Login Feature with Examples keyword with scenario outline",
  "description": "",
  "id": "free-crm-login-feature-with-examples-keyword-with-scenario-outline",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Free CRM Create a new contact scenario",
  "description": "",
  "id": "free-crm-login-feature-with-examples-keyword-with-scenario-outline;free-crm-create-a-new-contact-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "title of login page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user moves to new contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enters contact details \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003cposition\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "free-crm-login-feature-with-examples-keyword-with-scenario-outline;free-crm-create-a-new-contact-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "position"
      ],
      "line": 18,
      "id": "free-crm-login-feature-with-examples-keyword-with-scenario-outline;free-crm-create-a-new-contact-scenario;;1"
    },
    {
      "cells": [
        "naveenk",
        "test@123",
        "Tom",
        "Peter",
        "Manager"
      ],
      "line": 19,
      "id": "free-crm-login-feature-with-examples-keyword-with-scenario-outline;free-crm-create-a-new-contact-scenario;;2"
    },
    {
      "cells": [
        "naveenk",
        "test@123",
        "David",
        "Dsouza",
        "Director"
      ],
      "line": 20,
      "id": "free-crm-login-feature-with-examples-keyword-with-scenario-outline;free-crm-create-a-new-contact-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Free CRM Create a new contact scenario",
  "description": "",
  "id": "free-crm-login-feature-with-examples-keyword-with-scenario-outline;free-crm-create-a-new-contact-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "title of login page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user enters \"naveenk\" and \"test@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user moves to new contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enters contact details \"Tom\" and \"Peter\" and \"Manager\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition_with_example.title_of_login_page()"
});
formatter.result({
  "duration": 102535353,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 13
    },
    {
      "val": "test@123",
      "offset": 27
    }
  ],
  "location": "loginStepDefinition_with_example.user_enters_and(String,String)"
});
formatter.result({
  "duration": 2131524,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition_with_example.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 19905,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition_with_example.user_moves_to_new_contact_page()"
});
formatter.result({
  "duration": 59481,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tom",
      "offset": 29
    },
    {
      "val": "Peter",
      "offset": 39
    },
    {
      "val": "Manager",
      "offset": 51
    }
  ],
  "location": "loginStepDefinition_with_example.user_enters_contact_details_and_and(String,String,String)"
});
formatter.result({
  "duration": 266228,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition_with_example.close_the_browser()"
});
formatter.result({
  "duration": 21276,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Free CRM Create a new contact scenario",
  "description": "",
  "id": "free-crm-login-feature-with-examples-keyword-with-scenario-outline;free-crm-create-a-new-contact-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "title of login page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user enters \"naveenk\" and \"test@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user moves to new contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enters contact details \"David\" and \"Dsouza\" and \"Director\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition_with_example.title_of_login_page()"
});
formatter.result({
  "duration": 50972,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 13
    },
    {
      "val": "test@123",
      "offset": 27
    }
  ],
  "location": "loginStepDefinition_with_example.user_enters_and(String,String)"
});
formatter.result({
  "duration": 110837,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition_with_example.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 26405,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition_with_example.user_moves_to_new_contact_page()"
});
formatter.result({
  "duration": 28215,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 29
    },
    {
      "val": "Dsouza",
      "offset": 41
    },
    {
      "val": "Director",
      "offset": 54
    }
  ],
  "location": "loginStepDefinition_with_example.user_enters_contact_details_and_and(String,String,String)"
});
formatter.result({
  "duration": 275345,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition_with_example.close_the_browser()"
});
formatter.result({
  "duration": 51817,
  "status": "passed"
});
formatter.before({
  "duration": 124407,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "This is cukes test",
  "description": "",
  "id": "free-crm-login-feature-with-examples-keyword-with-scenario-outline;this-is-cukes-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@cukes"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "this is the first step",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "this is the second step",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "this is the third step",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition_with_example.this_is_the_first_step()"
});
formatter.result({
  "duration": 113021,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition_with_example.this_is_the_second_step()"
});
formatter.result({
  "duration": 100701,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinition_with_example.this_is_the_third_step()"
});
formatter.result({
  "duration": 102256,
  "status": "passed"
});
formatter.after({
  "duration": 89511,
  "status": "passed"
});
});