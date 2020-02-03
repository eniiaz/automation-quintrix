Feature: Google store automation

  @googleStore
  Scenario: Google store item placing
    When user goes to google store hompage
    Then user clicks on the nest wifi product
    Then user clicks on Buy button
    And user selects first option of router
    Then user should see "Google Nest Wifi router (Snow)" in the cart
