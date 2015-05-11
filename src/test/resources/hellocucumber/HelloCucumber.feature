@hello
Feature: Get to know Cucumber
  Training participants should learn basic Cucumber constructs so that they can apply it in their daily work and make their life better.

  Scenario: Eat cucumber
    Given I have a cucumber
    When I eat the cucumber
    Then I should not be hungry
    And I should have no cucumbers

  Scenario Outline: Eat cucumbers
    Given I have <cukes> cukes
    And I am hungry
    When I eat <eaten> cucumbers
    Then I should have <left cukes> cukes left
    And I should not be hungry anymore

    Examples:
      | cukes | eaten | left cukes |
      | 1     | 1     | 0          |
      | 5     | 2     | 3          |

  Scenario: Invite for a cucumber lunch
    Given my name is "Adam"
    And my friends are
      | name | email            |
      | Jane | jane@example.com |
      | John | john@example.com |
    When I invite them for lunch
    Then each of them is sent an email like this
      """
      Let's meet for cucumbers,
      Adam
      """