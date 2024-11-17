Feature: Loging application by using Excel Data driven test

  Scenario Outline: Loging with various credintials
    Given user navigate to Login page
    Then user should try to loged in the application with provided excel data "<row_index>"

    Examples: row_index
      | row_index |
      |         1 |
      |         2 |
      |         3 |
      |         4 |
      |         5 |
      |					6	|
      |					7	|