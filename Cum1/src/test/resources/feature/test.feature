
Feature: Registration Feature
  In order to perform successfull registration
  AS a user
  enter all details


      
Background:
    Given user navigates to the website
    When user validates the home page

Scenario Outline: Validate user is able to register
    Then user Fills the registration Form with username "<username>" email "<email>" and password "<password>"
    And user click on Register button
    
    
Examples:
|username|email|password|
|user1|email1|password1|
|user2|email2|password2|

