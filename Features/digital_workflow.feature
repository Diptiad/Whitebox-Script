Feature: Adintelle login feature for pro link
 @digital
  Scenario: whitebox testing for all the outputs in digital medium
    When user is landed on a home page
    Then user searches the Digital app in Operation menu
      | digital |
    Then user clicks on the digital option and land on Digital app
    Then Select the One Agency for the digital medium
    Then user is able to select the client and brand
      | AMAZON INC (AMAZON3) |
    Then user is able to download the outputs in plan page
    Then user is able to downlaod the outputs in estimate page
    Then user is able to downlaod the outputs in RO page
    Then user is able to download the outputs in cancel RO page
    Then user is able to download the outputs in postEstimate page
    Then user is able to download the outputs in fms page
    Then user is able to downlaod the outputs in client bill
    Then user is able to download the outputs in vendor bill page
    Then user is able to downlaod the status report