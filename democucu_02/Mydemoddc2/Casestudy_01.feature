Feature: Test me login

  Scenario Outline: Test me login 
    Given I am launching the test me application in chrome
    And I click on sign in link
    When I provide username"<uname>"
    And I provide password "<pswrd>"
    Then I click on login and verify the login status

    Examples: 
      | uname  | pswrd  |
      | asdfgh | asdfgh |
     