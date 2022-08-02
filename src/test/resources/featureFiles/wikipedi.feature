Feature: Wikipedia search feature
  As a user, I should be able to search terms and see related results

  @wikipedia @headerVerification
  Scenario: Wikipedia search header verification
    Given User is on Wikipedia home page
    When User types "Berlin" in the wiki search box
    And User clicks wiki search button
    Then User sees "Berlin" in the main header

  @wikipedia @headerVerificationDDT
  Scenario Outline: Wikipedia search header verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedMainHeader>" in the main header

    Examples: search terms we are going to search in wikipedia
      | searchValue             | expectedMainHeader      |
      | Frank-Walter Steinmeier | Frank-Walter Steinmeier |
      | Elon Musk               | Elon Musk               |
      | Bill Gates              | Bill Gates              |