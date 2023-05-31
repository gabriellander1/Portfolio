package steps;

import core.Hook;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.RadioButtonPage;

public class RadioButtonStepDefs {

    WebDriver driver = Hook.driver;

    RadioButtonPage radioButtonPage;
    @When("I click on {string}")
    public void iClickOn(String idRadioButton) {
        radioButtonPage = new RadioButtonPage(driver);
        radioButtonPage.clickRadioButton(idRadioButton);
    }

    @Then("I have selected {string}")
    public void iHaveSelectedTheRadioButton(String text) {
        radioButtonPage = new RadioButtonPage(driver);
        radioButtonPage.assertRadioButton(text);
    }
}
