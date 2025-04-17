package utility;

import org.openqa.selenium.WebDriver;
import pageObjects.FlipKartHomePage;

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

}
