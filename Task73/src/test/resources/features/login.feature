Feature:


  Scenario:
    Given navigate to ”https://www.amazon.com/”
    Then Enter “socks” to search box
    Then  Open the second page of the results
    Then Verify the second page is opened
    And Select the product on the second row and second column
    And Add the selected product to the Basket
    And Select first available size on the “Size” dropdown element
    And Click on the “See All Buying Options” button
    And Click on the “Add to Cart” button on the newly opened right panel
    Then Verify the “Added” text is visible on the “Qty” dropdown
