package pages;

import core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablesPage extends BasePage {
    public WebTablesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@id='addNewRecordButton']")
    WebElement buttonAdd;

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement inputFirstName;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement inputLastName;

    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement inputEmail;

    @FindBy(xpath = "//input[@id='age']")
    WebElement inputAge;

    @FindBy(xpath = "//input[@id='salary']")
    WebElement inputSalary;

    @FindBy(xpath = "//input[@id='department']")
    WebElement inputDepartment;

    @FindBy(xpath = "//button[@id='submit']")
    WebElement buttonSubmit;


    public void addNewRow(){
        click(buttonAdd);
        sendKeys(inputFirstName, "Gabriel");
        sendKeys(inputLastName, "Lander");
        sendKeys(inputEmail, "gabriel@test.com");
        sendKeys(inputAge, "26");
        sendKeys(inputSalary, "4000");
        sendKeys(inputDepartment, "QA");
        click(buttonSubmit);
    }

    public void assertNewRow(){
        Assert.assertEquals(getTextByTypeText("div", "Gabriel"), "Gabriel");
        Assert.assertEquals(getTextByTypeText("div", "Lander"), "Lander");
        Assert.assertEquals(getTextByTypeText("div", "gabriel@test.com"), "gabriel@test.com");
        Assert.assertEquals(getTextByTypeText("div", "26"), "26");
        Assert.assertEquals(getTextByTypeText("div", "4000"), "4000");
        Assert.assertEquals(getTextByTypeText("div", "QA"), "QA");
    }
}
