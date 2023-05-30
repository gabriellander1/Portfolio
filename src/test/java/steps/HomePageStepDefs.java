package steps;

import core.Hook;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import pages.HomePage;

public class HomePageStepDefs {

    WebDriver driver = Hook.driver;
    HomePage homePage;
    @Given("I am on {string} Page")
    public void iAmOnRegisterPage(String searchText) {
        homePage = new HomePage(driver);
        homePage.clickOnFeature(searchText);
    }
}
