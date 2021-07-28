package cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@CucumberOptions(
        features = {"src/test/resources/features/cases"},
        plugin = {"html:target/site/cucumber-pretty.html", "json:target/cucumber/cucumber.json"},
        glue = {"cucumber"}
)
public class RunTests extends AbstractTestNGCucumberTests {
    @BeforeTest
    public void beforeExecution() {
        System.out.println("Before Execution");
    }
    @AfterTest
    public void afterExecution() {
        System.out.println("After Execution");
    }

}
