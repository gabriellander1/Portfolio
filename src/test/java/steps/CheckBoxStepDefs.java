package steps;

import core.Hook;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CheckBoxPage;

public class CheckBoxStepDefs {

    WebDriver driver = Hook.driver;

    CheckBoxPage checkBoxPage;
    @When("I click on each check box separately")
    public void iClickOnHomeCheckBox() {
        checkBoxPage = new CheckBoxPage(driver);
        checkBoxPage.clickOnSeparateCheckBoxes();
    }

    @Then("I have selected")
    public void iHaveSelected() {
        checkBoxPage = new CheckBoxPage(driver);
        checkBoxPage.youHaveSelected();
    }
}
