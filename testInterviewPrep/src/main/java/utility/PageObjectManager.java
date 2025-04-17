package utility;

import org.openqa.selenium.WebDriver;
import pageObjects.FlipKartHomePage;
import pageObjects.JQueryHomePage;

public class PageObjectManager {
    browser b = new browser();
    private WebDriver driver;
    public PageObjectManager(){
        this.driver = b.driverInvocation();
    }

    public FlipKartHomePage getFlipKartHomepage(){
        FlipKartHomePage flipKartHomePage = new FlipKartHomePage(driver);
        return flipKartHomePage;
    }

    public JQueryHomePage getJQueryHomePage(){
        JQueryHomePage jQueryHomePage = new JQueryHomePage(driver);
        return jQueryHomePage;
    }

}
