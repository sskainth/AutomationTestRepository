package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utility.PageObjectManager;

import java.util.ArrayList;

public class WikiStep {
    ArrayList<String> shareholder,shareHolding;

    PageObjectManager pageObjectManager;
    public WikiStep(PageObjectManager pageObjectManager){
        this.pageObjectManager=pageObjectManager;
    }

    @Given("user etract the share holder value")
public void shareHolderValue(){
        shareholder=pageObjectManager.getWikiPage().getShareHolderValue();
        Assert.assertEquals("Promoters group",shareholder.get(0));
    }

    @When("user etract the share holding value")
    public void ShareHoldingValue() {
        shareHolding=pageObjectManager.getWikiPage().getShareHoldingValue();
      Assert.assertNotEquals("14.61%",shareHolding.get(0));
        System.out.println(shareHolding.get(0));
    }
}

