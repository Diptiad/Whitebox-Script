Feature: Adintelle login feature for pro link
  @tv
  Scenario: Regression test cases on pro for TV medium
   
    When user is able to search the TV App in Operation Drop Down
      | TV |
    Then user is able to select tv operation menu
    Then user is able to select client in TV App
      | client  | Brand        |
      | ABC India Pvt.Ltd. | ABC Brand |
    Then user is able to click on export button in estimate entries page
    Then user is able to export print Estimate option
    Then user is able to select tv Schedule menu
    Then user is able to select tv Release order menu
    Then user is able to export print RO option
    Then user is able to select tv RE menu
    Then user is able to export print RE option
    Then user is able to select tv Cancellation menu
    Then user is able to export print Cancellation option
    Then user is able to select tv MakeGood menu
    Then user is able to export print MakeGood option
    Then user is able to select tv WithHold menu
    Then user is able to export print WithHold option
    Then user is able to select tv Missed menu
    Then user is able to export print Missed option
    Then user is able to export RO Bulk print menu
    Then user pass the RO Date
     | From  | To        |
    | 01-01-2023 | 31-12-2023 |
    Then user is able to select TV Monitoring menu
    Then user is able to select Client Bill menu
    Then user is able to select Vendor Bill menu
    