Feature: Test contact us page fields
  As a user
  I want to fill in my details in the contact us page
  So I can submit my query to Intelligencebank

  Scenario: Test fields with valid information
    Given I open 'https://www.intelligencebank.com/'
    And I navigate to the Contact Us page
    When I fill in the form fields
    Then I should take a screenshot to confirm