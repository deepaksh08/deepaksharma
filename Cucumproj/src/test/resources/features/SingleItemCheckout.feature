Feature: Single Item checkout at BBBwebsite

  Background: 
    Given user navigates to the website

  @BBB
  Scenario: Checkout with Credit Card
    Then user Search for "<itemtype>" on site
      | SingleSkuItem | 
      | 1045630903  |
    And user navigates to PDP page and add item to cart
