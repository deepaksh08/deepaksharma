@XTSCENARIO
Feature: Login page feature

@XTSCENARIO
Scenario: Login page title
Given user is on home page
When user hits login option on home page
Then page title should be "Login | Bed Bath & Beyond"
And User validate third party login options
And User Valdiate heading 
And User enters email id "automationtest@yopmail.com"
Then User wait for sometime
Then User submit the email 




