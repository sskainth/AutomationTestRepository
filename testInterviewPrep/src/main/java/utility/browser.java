package utility;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class browser {


    WebDriver driver;

    public WebDriver driverInvocation(){

        if(driver==null){

            File f = new File("src/main/resources/configuration/frameworkconfig.properties");
            FileInputStream fis =null;
            try{
                fis = new FileInputStream(f);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            Properties properties = new Properties();
            try {
                properties.load(fis);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            properties.getProperty("browser");

            switch (properties.getProperty("browser").toLowerCase()){

                case "edge":
                    driver = new EdgeDriver();
                    break;

                case "chrome" :
                    driver = new ChromeDriver();
                    break;

                case "Safari":
                    driver = new SafariDriver();
                    break;
                default:
                    throw new InvalidArgumentException("please give valid browser");

            }
            driver.get(properties.getProperty("url"));
            driver.manage().window().maximize();
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));;
        }
        return driver;
    }

}
