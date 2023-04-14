Feature: Employee
  @katy
  Scenario: Valid Admin login
    #Given the user navigates to the url
    When user enters a valid email and password
    And click on Login Button
    When user clicks on PIM option
    And user click on Add employee button
    And user enters firstname and middle and lastname
    And user click on save button
    #And Close the browser