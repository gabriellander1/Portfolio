#language:en
#author:Gabriel Lander

  @Register
  Feature: Elements

    Scenario Outline: Text Box
      Given I am on "<feature>" Page
      And I am on "<menu>"
      When Fill Out Form
      Then I have my output

      Examples:
      | feature  | menu     |
      | Elements | Text Box |