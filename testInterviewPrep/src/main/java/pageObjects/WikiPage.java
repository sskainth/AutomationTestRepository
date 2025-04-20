package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.HashMap;

public class WikiPage {
    WebDriver driver;

    public WikiPage(WebDriver driver) {
        this.driver = driver;
    }


    public ArrayList<String> getShareHolderValue() {
        HashMap<String, String> shareHolderNHolding = new HashMap<String, String>();
        ArrayList<String> shareHolder = new ArrayList<String>();
        String str1;
        String str2;
        int countof1column = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();
        for (int i = 0; i < countof1column; i++) {
            str1 = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(i).getText();
            str2 = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).get(i).getText();
            shareHolder.add(str1);
            shareHolderNHolding.put(str1, str2);
        }

        System.out.println(shareHolderNHolding);
        return shareHolder;
    }

    public ArrayList<String> getShareHoldingValue() {
        ArrayList<String> shareHolding = new ArrayList<String>();
        String str2;
        int countof1column = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).size();
        for (int i = 0; i < countof1column; i++) {
            str2 = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).get(i).getText();
            shareHolding.add(str2);
        }
        return shareHolding;
    }
}
