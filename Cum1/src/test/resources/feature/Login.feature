Feature: Login Feature
  In order to perform successfull login
  AS a user
  Enter user name and password

Background:
    Given user navigates to the website
    When user validates the home page

@Sanity
  Scenario: Login to the website
    Then user enters "validstring" username
    And user enters "validstring" password
    And user click on sign in button
 
@Sanity 
 Scenario Outline: Validate Error message on login page
    Then user enters "<username>" username
    And user enters "<password>" password
    And user click on sign in button

    
Examples:
|username|password|
|invalid|invalid|
|invalid|valid|
|valid|invalid|



