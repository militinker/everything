Feature: Employee Search

  Background:
    When user enters valid email and valid password
    And click on login button
    When user clicks on PIM option
  @smoke1
  Scenario: Search Employee by Id
   # Given open the browser and launch HRMS application
#    When user enters valid email and valid password
#    And click on login button
#    When user clicks on PIM option
    When user enters valid employee id
    And clicks on search button
    And user see employee information displayed
   # And close the browser

    @smoke1
    Scenario: Search Employee by Job Title
     # Given open the browser and launch HRMS application
 #     When user enters valid email and valid password
 #     And click on login button
#      When user clicks on PIM option
      When user selects Job Title
      And clicks on search button
      And user see employee information displayed
    #  And close the browser

  #Background is used to define all the common steps that multiple scenarios
  # have in the same feature file, till the time flow isnt broken