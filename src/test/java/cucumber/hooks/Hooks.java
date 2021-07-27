package cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import salesforce.config.EnvironmentConfig;

import static core.selenium.MyWebDriverManager.getWebDriverManager;

public class Hooks {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = getWebDriverManager().getDriver();
        driver.get(EnvironmentConfig.getEnvironmentConfig().getLogin());
    }

    @After
    public void tearDown() {
        getWebDriverManager().quitDriver();
    }
}
