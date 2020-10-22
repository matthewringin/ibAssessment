Feature: Test contact us page fields
  As a user
  I want to fill in my details in the contact us page
  So I can submit my query to Intelligencebank

  Scenario Outline: Test fields with valid information
    Given I open 'https://www.intelligencebank.com/'
    And I navigate to the 'CONTACT US' page
    When I type '<company>' into the company field
    And I type '<firstName>' into the first name field
    And I type '<lastName>' into the last name field
    And I type '<email>' into the email field
    And I select '<country>' in the country selector
    And I type '<phone>' into the phone field
    And I type '<enquiry>' into the enquiry field
    And I select '<product>' in the product selector
    And I click the checkbox
    Then I should take a screenshot to confirm and close the site

    Examples:
      | company | firstName | lastName | email                               | country | phone      | enquiry     | product |
      | IB      | Matt      | Ringin   | matthew.ringin@intelligencebank.com | AU      | 0451791194 | Please help | DAM     |