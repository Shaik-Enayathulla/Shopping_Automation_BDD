Feature: User subscribes to the newsletter on the homepage

  Scenario: User successfully subscribes to the newsletter
    Given User launch the page and land at Home page of application
    When User scroll down until the text "SUBSCRIPTION" is visible
    And User enters a valid email address in the subscription input field
    And User clicks the subscribe arrow button
    Then User verifies the success message "You have been successfully subscribed!" is visible
