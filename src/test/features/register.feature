Feature: create new account on Madisson store
  As a user [...]
  I want [...]
  So that [...]
  Scenario: register with required data
    Given visitor is on register page "http://demo-store.seleniumacademy.com/customer/account/create/"
    When user fillout the register form
    And user click on register button
    Then user has been registered

    Scenario: register with invalid data
      Given
      When
      Then


