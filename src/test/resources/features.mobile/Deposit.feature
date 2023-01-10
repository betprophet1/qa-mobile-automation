Feature: Deposit

  @withdraw @android
  Scenario: Verify user can deposit money successfully
    Given I open Android app
    When I log in to Android app successfully
    And select Account tab
    Then verify deposit money successfully with amount "1000"