#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Validate the login functionality in youtube

  Scenario Outline: Login to Social Media
    Given browser is open
    When navigate to <url>
    And enter valid <username> and <password>
    Then able to see homepage

    Examples: 
      | url                  | username            | password |
      | https://youtube.com  | anand5581@gmail.com | Sx4@0258 |
      | https://facebook.com | anand5581@gmail.com | Fzs@7620 |
