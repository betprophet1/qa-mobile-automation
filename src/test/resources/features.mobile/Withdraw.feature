Feature: Withdraw

  @withdraw @android
  Scenario: Verify user can withdraw money successfully
    Given I open Android app
    When I log in to Android app successfully
      And select Account tab
    Then verify withdraw money successfully with amount "1000"