package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import pages.RegisterPage;

public class RegisterStepDefs {
    WebDriver driver;
    RegisterPage registerPage;

    @Given("I am on Register Page")
    public void iAmOnRegisterPage() {
        SafariOptions options = new SafariOptions();
        driver = new SafariDriver(options);
        Dimension dimension = new Dimension(1920, 1080);
        driver.manage().window().setSize(dimension);
        driver.get("https://demo.automationtesting.in/Register.html");
        registerPage = new RegisterPage(driver);
    }

    @When("Fill Out Form")
    public void fillOutForm() {
        registerPage.fillOutForm();
    }

    @Then("I have my registration")
    public void iHaveMyRegistration() {
        System.out.println("to do");
    }
}
