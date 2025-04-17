package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JQueryHomePage {

    WebDriver driver;

    public JQueryHomePage(WebDriver driver){
        this.driver = driver;
    }

    public void dragAndDrop() {
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement destination = driver.findElement(By.id("droppable"));
        Actions a = new Actions(driver);
        a.dragAndDrop(source, destination).build().perform();
        //driver.switchTo().defaultContent();
    }
    public void getDroppedText(){}
}
