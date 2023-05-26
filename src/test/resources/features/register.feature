#language:en
#author:Gabriel Lander

  @Register
  Feature: Register

    Scenario: Full Register
      Given I am on Register Page
      When Fill Out Form
      Then I have my registration