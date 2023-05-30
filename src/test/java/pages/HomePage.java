package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }



    public void clickOnFeature(String searchText){
        click(findElementUsingText("h5", searchText));
    }
}
