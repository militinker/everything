Feature: Login Functionalities
  @smoke
  Scenario: Valid Admin Login
   # Given open the browser and launch HRMS application
    When user enters valid email and valid password
    And click on login button
    Then user is logged in successfully
   # And close the browser

  @smoke2
  Scenario: Valid Admin Login
   # Given open the browser and launch HRMS application
    When user enters valid "admin" and valid "Hum@nhrm123"
    And click on login button
    Then user is logged in successfully
   # And close the browser

    #Hooks: For definig pre and Post steps in any Cucumber framework
  #       : This is always created inside the StepDefinitions folder
  #       :Hooks will take care of pre and post conditions irrespective of what goes in between the test cases



  @scenarioOutline
  #Parametarization/ Data Driven
    Scenario Outline:
  # Given open the browser and launch HRMS application
    When user enters valid "<username>" and valid "<password>"
    And click on login button
    Then user is logged in successfully
   # And close the browser
  Examples:
      | username | password |
      | admin    | Hum@nhrm123 |
      | ADMIN    | Hum@nhrm123 |
      | Jason    | Hum@nhrm123 |

  @dataTable
  Scenario: Login with multiple credentials using data table
    When user enters username and password and verifies login
      | username | password    |
      | admin    | Hum@nhrm123 |
      | ADMIN    | Hum@nhrm123 |
      | Jason    | Hum@nhrm123 |
