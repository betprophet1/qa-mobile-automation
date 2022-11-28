Feature: Login

  @login @ios
  Scenario: Login with iOS app successfully
    Given I open iOS app
    When I log in to iOS app

  @login @android
  Scenario: Login with iOS app successfully
    Given I open Android app
    When I log in to Android app successfully

  @login @android
  Scenario: Logout with Android app successfully
    Given I open Android app
    When I log out to Android app successfully

