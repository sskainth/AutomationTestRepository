package utility;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageObjectManager {
    public browser base;
    private WebDriver driver;
    public PageObjectManager(){

        base = new browser();
        this.driver = base.driverInvocation();
    }

    public FlipKartHomePage getFlipKartHomepage(){
        FlipKartHomePage flipKartHomePage = new FlipKartHomePage(driver);
        return flipKartHomePage;
    }

    public JQueryHomePage getJQueryHomePage(){
        JQueryHomePage jQueryHomePage = new JQueryHomePage(driver);
        return jQueryHomePage;
    }


    public WikiPage getWikiPage(){
        WikiPage wikiPage = new WikiPage(driver);
        return wikiPage;
    }


    public AmazonHomePage getAmazonHomePage(){
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        return amazonHomePage;
    }

    public BabyWishListPage getBabyWishListPage(){
        BabyWishListPage babyWishListPage = new BabyWishListPage(driver);
        return babyWishListPage;
    }


}
