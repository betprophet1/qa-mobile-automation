Feature: View Account

  @account @ios
  Scenario: View Profile
    Given I open iOS app
    When I log in to iOS app
      And go to Account tab
    Then verify user can view Profile successfully

  @account @ios
  Scenario: View Account Statement
    Given I open iOS app
    When I log in to iOS app
      And go to Account tab
    Then verify user can view Account Statement successfully

  @account @android
  Scenario: View Profile
    Given I open Android app
    When I log in to Android app successfully
      And go to Account tab
    Then verify user can view Profile successfully

  @account @android
  Scenario: View Account Statement
    Given I open Android app
    When I log in to Android app successfully
      And go to Account tab
    Then verify user can view Account Statement successfully

  @account @android
  Scenario: View Account Statement
    Given I open Android app
    When I log in to Android app successfully
    And go to Account tab
    Then verify user can view Account Statement successfully

  @account @android
  Scenario: View Communication Preferences
    Given I open Android app
    When I log in to Android app successfully
      And go to Account tab
    Then verify user can view Communication Preferences successfully

  @account @android
  Scenario: View Change Password
    Given I open Android app
    When I log in to Android app successfully
      And go to Account tab
    Then verify user can view Change Password successfully

  @account @android
  Scenario: View Betting Limits
    Given I open Android app
    When I log in to Android app successfully
      And go to Account tab
    Then verify user can view Betting Limits successfully

  @account @android
  Scenario: View Cool Off
    Given I open Android app
    When I log in to Android app successfully
      And go to Account tab
    Then verify user can view Cool Off successfully

  @account @android
  Scenario: View Self-Exclusion
    Given I open Android app
    When I log in to Android app successfully
    And go to Account tab
    Then verify user can view Self Exclusion successfully