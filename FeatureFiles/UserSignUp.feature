Feature: User Registration testing

  @Sanity, @Regression
  Scenario: Successful Signup and Login
    Given user launched the appplication and view the home screen
    When the user clicks on Signup button
    When the user enters name and email address
      | Name  | Shaikkhan         |
      | Email | khan@example.com |
    And the user clicks Signup button
    And the user fills account details
      | Title         | Mr.         |
      | Name          | Shaikk        |
      | Password      | password123 |
      | Date of Birth | 12/12/1990  |
    And the user selects  checkbox
    And the user fills address details
      | FirstName    | Shaik          |
      | LastName     | Khan           |
      | Company      | ABC           |
      | Address      | 123 Main St   |
      | Address2     | Apt 101       |
      | Country      | United States |
      | State        | New York      |
      | City         | New York      |
      | Zipcode      |         10001 |
      | MobileNumber |    1234567890 |
    And the user clicks Create Account button
    Then "ACCOUNT CREATED!" is visible
    #When the user clicks "Continue" button
    #Then "Logged in as username" is visible
   # When the user clicks "Delete Account" button
    #Then "ACCOUNT DELETED!" is visible
    #And the user clicks "Continue" button
