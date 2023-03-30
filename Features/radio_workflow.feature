Feature: Adintelle login feature for pro link
@radio
  Scenario: Regression test cases on pro for radio medium
  When user is able to search the radio App in Operation Drop Down
      | Radio |
    Then user is able to select radio operation menu
    Then user is able to select client in radio App
      | client  | Brand        |
      | ABC India Pvt.Ltd. | ABC Brand |
    Then user is able to click on radio export button in estimate entries page
    Then user is able to export radio print Estimate option
    Then user is able to select radio Schedule menu
    Then user is able to select radio Release order menu
    Then user is able to export radio print RO option
    Then user is able to select radio RE menu
    Then user is able to export radio print RE option
    Then user is able to select radio Cancellation menu
    Then user is able to export radio print Cancellation option
    Then user is able to select radio MakeGood menu
    Then user is able to export radio print MakeGood option
    Then user is able to select radio WithHold menu
    Then user is able to export radio print WithHold option
    Then user is able to select radio Missed menu
    Then user is able to export radio print Missed option
    Then user is able to export radio RO Bulk print menu
    Then user pass the radio RO Date
     | From  | To        |
    | 01-01-2023 | 31-12-2023 |
    Then user is able to select radio Client Bill menu
    Then user is able to select radio Vendor Bill menu