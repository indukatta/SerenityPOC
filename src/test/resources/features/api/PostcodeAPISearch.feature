Feature: Postcode status check
  Scenario Outline: User checks the postcode api response status
    Given User sets the postcode service api endpoint
    When User sends a Get HTTP request to search postcode : '<postcode>'
    Then User should receive a response status : 200

    Examples:
    | postcode |
    | SW1P4JA  |