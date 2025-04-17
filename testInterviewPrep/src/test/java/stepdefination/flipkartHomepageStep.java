package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.PageObjectManager;

public class flipkartHomepageStep {

    PageObjectManager pageObjectManager;
    public flipkartHomepageStep(PageObjectManager pageObjectManager){
        this.pageObjectManager = pageObjectManager;
    }

@When("user enter the goods for search {string}")
    public void userEneterProduct(String product){
    pageObjectManager.getFlipKartHomepage().searchProduct(product);

}

    @And("search the product")
    public void searchTheProduct() {
        System.out.println("inside the ");
    }

    @Then("verify the search the page")
    public void verifyTheSearchThePage() {
    }
}
