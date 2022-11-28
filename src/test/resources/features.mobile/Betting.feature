Feature: Place Wager

  @login @android
  Scenario: Place a request Moneyline bet successfully
    Given I open Android app
    When I log in to Android app successfully
    When place a request Moneyline bet on "Android"