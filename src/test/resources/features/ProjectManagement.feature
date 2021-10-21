Feature: Project Management Page

  Testing functionalities of Project Management

  Background:
    Given User is logged into Microsoft account

  @ui @AMLBC1-T1
  Scenario Outline: Creating a Project
    Given user is on the SAC page
    And click on Project Management page
    When <Project Name> and <Description> is entered a new project is created
    Then project history table should be visible
    And project is visible on the dropdown
    And list items on SAC page should be enabled with the name of the project
    Examples:
      | Project Name | Description    |
      | Test_Project | This is a test |