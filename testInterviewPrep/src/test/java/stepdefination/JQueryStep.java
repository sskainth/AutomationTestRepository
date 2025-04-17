package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utility.PageObjectManager;

public class JQueryStep {

    PageObjectManager pageObjectManager;

    public JQueryStep(PageObjectManager pageObjectManager){
        this.pageObjectManager = pageObjectManager;

    }

    @Given("user perform drag and drop")
    public void performDragDrop(){
        pageObjectManager.getJQueryHomePage().dragAndDrop();
    }

    @Then("validate the tet")
    public void validateTheTet() {
    }
}
