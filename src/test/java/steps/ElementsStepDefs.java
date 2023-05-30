package steps;

import core.Hook;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.ElementsPage;

public class ElementsStepDefs{

    WebDriver driver = Hook.driver;
    ElementsPage elementsPage;

    @And("I am on {string}")
    public void iAmOnMenu(String menu){
        elementsPage = new ElementsPage(driver);
        elementsPage.clickOnMenu("span", menu);
    }
}
