Feature: Feature to test the List input

Background:
    Given user navigates to the website
    When user validates the home page

@Sanity
  Scenario: Login to the website
    Then user enters "validstring" username
    And user enters "validstring" password
    And then user enters firstname and lastname
    |firstnameone | lastnameone |
    |firstnametwo | lastnametwo |
    And user click on sign in button
 

    
    