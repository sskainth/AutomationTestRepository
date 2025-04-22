package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utility.PageObjectManager;

public class AmazonHomePageStep {
    PageObjectManager pageObjectManager;

    public AmazonHomePageStep(PageObjectManager pageObjectManager){
        this.pageObjectManager=pageObjectManager;
    }
    @When("user mousehover on profile and select the babywishlist from drop down")
    public void selectBabyWishList(){
        pageObjectManager.getAmazonHomePage().slectBabyWishlist();
    }

    @Then("validate the navigation")
    public void validateTheNavigation() {
        String search=pageObjectManager.getBabyWishListPage().getTitlePage();
        Assert.assertEquals("Baby Wishlist",search);


    }
}
