Feature:
  Background:
    Given user is on the homepage of CurrysPC website
    When user wants to search for HP Laptops
    Then user should able to see all HP Laptops

    Scenario: Search all HP Laptop over £1000
      Given user is on the result page of HP laptop
      When user clicks on over £1000 price filter
      And user clicks on i7 HP spectre Laptop
      Then user should able to see i7 HP spectre Laptop