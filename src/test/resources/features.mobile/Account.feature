Feature: View Account

  @account
  Scenario: View Profile
    Given I open iOS app
    When I log in to iOS app
      And go to Account tab
    Then verify user can view Profile successfully

  @account
  Scenario: View Profile
    Given I open iOS app
    When I log in to iOS app
    And go to Account tab
    Then verify user can view Account Statement successfully

