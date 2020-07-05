Feature: Validate the login functionality in youtube

  Scenario: Login to Social Media
    Given browser is open
    When navigate to url
    And enter valid username and password
    Then able to see homepage
