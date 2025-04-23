package hooks;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utility.PageObjectManager;

public class Hooks {


    PageObjectManager pageObjectManager;

    public Hooks(PageObjectManager pageObjectManager) {
        this.pageObjectManager = pageObjectManager;
    }

    @Before()
    public void preCondition() {
        System.out.println("execution starts..................");
    }

    @After()
    public void postCondition() {
        pageObjectManager.base.driverInvocation().quit();
    }

    @BeforeStep()
    public void precondition(Scenario sc){
        try {
            TakesScreenshot sshot = (TakesScreenshot) pageObjectManager.base.driverInvocation();
            // System.out.println(pageObjectManager.base.driverInvocation().getCurrentUrl());
            byte[] bytedata = sshot.getScreenshotAs(OutputType.BYTES);

            sc.attach(bytedata, "image/png", "step shot");
        } catch (Exception e) {
            System.out.println("screen shot nahi attach hua"+e.getMessage());
            throw new RuntimeException(e);
        }
        System.out.println("@BeforeStep");
    }

    @AfterStep()
    public void Screensho() {


    }
}
