Feature: Hello, user
  In order to have a good mood
  As a user
  I want to be greeted

  Scenario: Hello Adam
    Given my name is "Adam"
    When I want to be greeted
    Then I am greeted as "Hello, Adam"
