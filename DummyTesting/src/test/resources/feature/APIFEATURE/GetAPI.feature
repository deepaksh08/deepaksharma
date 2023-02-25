@APISCENARIO
Feature: To test a get api


@APISCENARIO
Scenario: Get api call
Given User open the api
When user valided status as 300
Then user validated reponse contains "total_pages"