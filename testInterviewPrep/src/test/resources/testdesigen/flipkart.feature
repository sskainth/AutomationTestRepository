Feature: trying flipkart for learning

  @test
Scenario: search functionality for learning flipkart
  When user enter the goods for search "iPhone"
  And search the product
  Then verify the search the page



  @test1
  Scenario: search functionality for file learning
    When user enter the goods for search from file "products"
    And search the product
    Then verify the search the page


