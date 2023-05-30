package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends BasePage {

    public ElementsPage(WebDriver driver){
        super(driver);
    }

    public void clickOnMenu(String type, String value){
        click(findElementUsingText(type, value));
    }
}
