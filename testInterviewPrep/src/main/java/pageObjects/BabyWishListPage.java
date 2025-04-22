package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BabyWishListPage {
    WebDriver driver;
    public BabyWishListPage(WebDriver driver){
        this.driver=driver;
    }
    public String getTitlePage(){
        return driver.findElement(By.className("nav-text")).getText();
    }
}
