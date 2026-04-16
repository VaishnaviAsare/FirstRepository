Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters username "admin" and password "admin123"
    Then the user should be logged in successfully

  Scenario: Failed login with invalid credentials
    Given the user is on the login page
    When the user enters username "admin" and password "wrongpass"
    Then the user should see an error message