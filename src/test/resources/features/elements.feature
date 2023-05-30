#language:en
#author:Gabriel Lander

  @Elements
  Feature: Elements

    @TextBox
    Scenario Outline: Text Box
      Given I am on "<feature>" Page
      And I am on "<menu>"
      When Fill Out Form
      Then I have my output

      Examples:
      | feature  | menu     |
      | Elements | Text Box |

    @CheckBox
    Scenario Outline: Check Box
      Given I am on "<feature>" Page
      And I am on "<menu>"
      When I click on each check box separately
      Then I have selected

      Examples:
      | feature  | menu      |
      | Elements | Check Box |