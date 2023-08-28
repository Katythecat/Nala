Feature: test the login functionality

  @smoke
  Scenario: validate admin login
    #Given the user navigates to the url
    When user enters a valid email and password
    And click on Login Button
    And use logged in successfully
    #And close the browser