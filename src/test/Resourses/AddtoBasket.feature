Feature: Add to Basket
  As a user
  I want to select product
  so I can verify selected product is in basket

  Scenario: Verify selected product in basket

    Given I am on Homepage
    When I hoover on Department "Home & Furniture"
    And I hoover on SubDepartment "Kitchen & Dining"
    And I select product category "Dining Room Furniture"
    And I select and click on Product from Image "Hudson Small Sideboard"
    And I click to Add to Basket
    And I click to Shopping Bag
    And I Hoover on shoppingbag and click on "VIEW/EDIT BAG"
    Then I should see and verify ProductName
    Then I should see and verify Productcode
