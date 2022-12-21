Feature: Place Wager

  @login @android
  Scenario: Place a request Moneyline bet successfully
    Given I open Android app
    When I log in to Android app successfully
      And place a request Moneyline bet with
        | Stake     | Odds |
        | 100       | 120  |
      And click Confirm place wager
      And click View ALl Bets
    Then verify your bets displaying in Bet Tab with infomation
      | Stake     | Odds |
      | 100       | 120  |

  @login @android
  Scenario: Place a request Spead bet successfully
    Given I open Android app
    When I log in to Android app successfully
    And place a request Spread bet with
      | Stake     | Odds |
      | 100       | 120  |
    And click Confirm place wager
    And click View ALl Bets
    Then verify your bets displaying in Bet Tab with infomation
      | Stake     | Odds |
      | 100       | 120  |

  @login @android
  Scenario: Place a request Total bet successfully
    Given I open Android app
    When I log in to Android app successfully
      And place a request Total bet with
        | Stake     | Odds |
        | 100       | 120  |
      And click Confirm place wager
      And click View ALl Bets
    Then verify your bets displaying in Bet Tab with infomation
      | Stake     | Odds |
      | 100       | 120  |
