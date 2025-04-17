Feature: trying flipkart for learning

  @test
Scenario: search functionality for learning
  When user enter the goods for search "tablet"
  And search the product
  Then verify the search the page
