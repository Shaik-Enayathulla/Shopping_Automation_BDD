Feature: Automation Exercise Contact Us Functionality
  As a user, I want to verify the contact us functionality
  So that I can submit my queries successfully

  Scenario: Successful Contact Us Submission
    Given user navigates to Contact Us page
    When the user enters name, email, subject, and message
    |Name		|	Shaik	|
    |Email	|	Shaik123@gmail.com	|
    |Subject|	Test	|
    |Message|	Testing the Contact Us page funtionallity	|
    And the user uploads a file from "C:\Users\Shaik\Selenium Automation\Practicing_Content\Sample.txt"
    And the user clicks Submit button
    And user click OK for alert window
    Then the success message "Success! Your details have been submitted successfully." should be visible
    #When the user clicks "Home" button
    #Then the user should land on home page successfully
