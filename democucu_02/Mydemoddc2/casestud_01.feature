

Feature: To register with test me application
@Sanity
   Scenario Outline: Test me registration
    Given User launching the test me application in chrome
    And User clicks on Signup link
    When User enters username "<uname>"
    When User enters firstname "<fname>"
    When User enters lastname "<lname>"
    When User enters password "<pwrd>"
     When User enters confirm password "<cpwrd>"
     When User selects gender
     When User enters email "<email>"
     When User enters mobile number "<mobno>"
     When User enters dob "<dob>"
     When User enters address "<address>"
    
  
   Then User clicks on register link
     

    Examples: 
      | uname  | fname | lname  | pwrd | cpwrd |email |mobno | dob | address |
      | hanEEsha23 | haneesha     | yamana |haneesha |haneesha|abc@gmail.com|9876543210|25/07/19|Telanagana India|
      
