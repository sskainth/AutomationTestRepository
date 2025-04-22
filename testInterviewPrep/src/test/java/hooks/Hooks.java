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

    @AfterStep()
    public void takeScreenshot(Scenario sc) {

        TakesScreenshot ts = (TakesScreenshot) pageObjectManager.base.driverInvocation();
        byte[] bytedate = ts.getScreenshotAs(OutputType.BYTES);
        sc.attach(bytedate, "image/png", sc.getName());


    }
}
