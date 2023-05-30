package pages;

import core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage {

    public TextBoxPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@id='userName']")
    WebElement inputUserName;

    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement inputUserEmail;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement textAreaCurrentAddress;

    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    WebElement textAreaPermanentAddress;

    @FindBy(xpath = "//button[@id='submit']")
    WebElement buttonSubmit;


    public void clickOnMenu(String menu){
        click(findElementUsingText("span", menu));
    }

    public void fillOutTextBoxForm(){
        sendKeys(inputUserName, "Jane Doe");
        sendKeys(inputUserEmail, "janedoe@gmail.com");
        sendKeys(textAreaCurrentAddress, "2551 Vista Dr #B301, Juneau, Alaska 99801, USA");
        sendKeys(textAreaPermanentAddress, "156 Michael Ct #4, Anchorage, Alaska 99504, USA");
        click(buttonSubmit);
    }

    public void assertForm(){
        Assert.assertEquals("Name:Jane Doe", getText("p", "id", "name"));
        Assert.assertEquals("Email:janedoe@gmail.com", getText("p", "id", "email"));
        Assert.assertEquals("Current Address:2551 Vista Dr #B301, Juneau, Alaska 99801, USA", getText("p", "id", "currentAddress"));
        Assert.assertEquals("Permanent Address:156 Michael Ct #4, Anchorage, Alaska 99504, USA", getText("p", "id", "permanentAddress"));
    }

}
