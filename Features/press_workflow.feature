Feature: Adintelle login feature for pro link
  @press
  Scenario: Regression test cases on pro for Press medium
    When user is able to search the Press App in Operation Drop Down
      | press |
    Then user is able to select any one Branch
    Then user is able to select client in press App
      | client  | Brand        |
      | amazon4 | AMAZON PRIME |
    Then user is able to select Brand and click on Existing Estimate
      | Script01 |
    #Downloding the estimate level output
    Then user is able to click on export button in estimate entries page
    Then user is able to export print Estimate option
    Then user is able to export print original output
    Then user is able to export est cum schedule output
    Then user is able to export print supp estimate
    #Downloading the RO output
    Then user clicks on print document to download RO output
    Then user clicks on Client bill option to download client bill outputs
    Then user downloads the status report
