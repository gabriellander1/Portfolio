package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class HomePageStepDefs {

    WebDriver driver;

    @Given("I am on {string} Page")
    public void iAmOnRegisterPage(String searchText) {
        System.out.println("featurePage");
        //HomePage homePage = new HomePage(driver);
        //homePage.clickOnFeature(searchText);
    }
}
