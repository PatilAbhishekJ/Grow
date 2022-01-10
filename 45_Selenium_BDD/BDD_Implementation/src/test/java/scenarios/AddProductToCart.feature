Feature: Automated E2E Tests
  Description: The purpose of this feature is to test the End 2 End Integration

  Scenario: User searches a product and adds it to cart
    Given user is on Home Page
    When user searches for "Laptop"
    And user chooses the first item available
    Then user adds it to cart