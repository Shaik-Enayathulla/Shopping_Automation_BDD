Feature: User login functionality

  Scenario: User logs their account
    Given user navigate to Login page
    When user enter the correct email address as "shaik123@123.com" and password as "12345"
    And user click on the login button
    Then "Logged in as Shaik" should be visible
    #When I click on the "Delete Account" button
    #Then "ACCOUNT DELETED!" should be visible
