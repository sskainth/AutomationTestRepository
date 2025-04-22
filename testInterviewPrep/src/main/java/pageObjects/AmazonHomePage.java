package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class AmazonHomePage {
    WebDriver driver;
    public AmazonHomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void slectBabyWishlist()
    {
        WebElement profileElement= driver.findElement(By.id("nav-link-accountList"));
        Actions a = new Actions(driver);
        a.clickAndHold(profileElement).build().perform();
        driver.findElement(By.partialLinkText("by Wishlist")).sendKeys(Keys.CONTROL,Keys.ENTER);
        Set<String> winproperties=driver.getWindowHandles();
        Iterator<String> i = winproperties.iterator();
        String parentwindow = i.next();
        String childhandleproperty=i.next();
        driver.switchTo().window(childhandleproperty);
    }
}
