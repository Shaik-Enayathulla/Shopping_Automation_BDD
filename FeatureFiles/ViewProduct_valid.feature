Feature: Product detail page verification

  Scenario: Verify product details on the product detail page
    Given user navigates to All Products page
    When the user clicks on View Product text link of the first product
    Then the user verifies the product name, category, price, availability, condition and brand product details are visible