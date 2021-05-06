

# with examples keyword using data driven approach, scenarios becomes scenario outline. similar to dataprovider


Feature: Free CRM Login Feature with Examples keyword with scenario outline

  Scenario Outline: Free CRM Create a new contact scenario

    Given title of login page
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user moves to new contact page
    Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
    Then Close the browser

    Examples:
      | username | password | firstname | lastname | position |
      | naveenk  | test@123 | Tom 	  | Peter    | Manager  |
      | naveenk  | test@123 | David 	  | Dsouza   | Director |


  @cukes
  Scenario: This is cukes test
    Given this is the first step
    When this is the second step
    Then this is the third step
