Feature: Login func

  Scenario: Login with valid account
    Given Navigate to campus
    When  Enter username and password
    Then  User should login with success

