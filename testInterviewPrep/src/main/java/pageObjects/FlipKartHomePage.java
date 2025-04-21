package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.ExcelHandler;

public class FlipKartHomePage {
    WebDriver driver;
    public FlipKartHomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickMobileIcon(){
        driver.findElement(By.className("_2puWtW _3a3qyb")).click();
    }

    public void searchProduct(String product){
        driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys(product);
        driver.findElement(By.xpath("//input[@class='Pke_EE']")).click();
    }

    public void searchProduct(String sheet,int row,int column){
        String product = ExcelHandler.readData(sheet,row,column);
        driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys(product);
        driver.findElement(By.xpath("//input[@class='Pke_EE']")).click();
    }

}
