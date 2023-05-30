package steps;

import core.Hook;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.TextBoxPage;

public class TextBoxStepDefs {
    WebDriver driver = Hook.driver;


    @When("Fill Out Form")
    public void fillOutForm() {
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.fillOutTextBoxForm();
    }

    @Then("I have my output")
    public void iHaveMyRegistration() {
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.assertForm();
    }
}
