package steps;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.ElementsPage;

public class ElementsStepDefs{

    WebDriver driver;

    @And("I am on {string}")
    public void iAmOnMenu(String menu){
        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.clickOnMenu("span", menu);
    }
}
