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

    @RadioButton
    Scenario Outline: Radio Button
      Given I am on "<feature>" Page
      And I am on "<menu>"
      When I click on "<radioButton>"
      Then I have selected "<radioButton>"

      Examples:
      | feature  | menu         | radioButton |
      | Elements | Radio Button | Yes         |
      | Elements | Radio Button | Impressive  |

    @WebTables
    Scenario Outline: Web Tables
      Given I am on "<feature>" Page
      And I am on "<menu>"
      When I add a new row
      Then The new row is in table

      Examples:
      | feature  | menu       |
      | Elements | Web Tables |