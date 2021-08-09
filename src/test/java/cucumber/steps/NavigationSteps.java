package cucumber.steps;

import io.cucumber.java.en.When;
import salesforce.ui.PageTransporter;

public class NavigationSteps {
    @When("I navigate to the {string} page")
    public void iNavigateToThePage(final String pageName) {
        //Navigate to web site
        PageTransporter pageTransporter = new PageTransporter();
        pageTransporter.goToPage(pageName);
    }
}
