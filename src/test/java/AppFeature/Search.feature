Feature: Amazon search

  Scenario: Search a product
    Given I have search field on amazon page
    When I searched for a product with name "APPLE MACBOOK" and price 1000
    Then Product with name "APPLE MACBOOK" should be displayed