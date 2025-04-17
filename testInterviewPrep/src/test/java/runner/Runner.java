package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/testdesigen"},
        glue = {"stepdefination"},
        tags = "@test",
        plugin = {"pretty"}
)

public class Runner {


}

