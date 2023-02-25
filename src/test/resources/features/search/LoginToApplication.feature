Feature: Login to HRM
  Scenario: Login with valid credentials
    Given user is on home page
    When user enters admin as username
    And user enters admin123 as password
    Then user should be able to login