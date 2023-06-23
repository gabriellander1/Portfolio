package steps;

import core.Hook;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.WebTablesPage;

public class WebTablesStepDefs {

    WebDriver driver = Hook.driver;
    @When("I add a new row")
    public void iAddANewRow() {
        WebTablesPage webTablesPage = new WebTablesPage(driver);
        webTablesPage.addNewRow();
    }

    @Then("The new row is in table")
    public void theNewRowIsInTable() {
        WebTablesPage webTablesPage = new WebTablesPage(driver);
        webTablesPage.assertNewRow();
    }
}
