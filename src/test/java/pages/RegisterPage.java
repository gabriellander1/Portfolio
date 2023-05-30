package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@ng-model='FirstName']")
    WebElement inputFirstName;





}
