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

    @FindBy(xpath = "//input[@ng-model='LastName']")
    WebElement inputLastName;

    @FindBy(xpath = "//textarea[@ng-model='Adress']")
    WebElement textAreaAdress;

    @FindBy(xpath = "//input[@ng-model='EmailAdress']")
    WebElement inputEmailAdress;

    @FindBy(xpath = "//input[@ng-model='Phone']")
    WebElement inputPhone;

    @FindBy(xpath = "//input[@value='Male']")
    WebElement inputMale;

    @FindBy(xpath = "//input[@value='FeMale']")
    WebElement inputFeMale;

    @FindBy(xpath = "//input[@value='Cricket']")
    WebElement inputCricket;

    @FindBy(xpath = "//input[@value='Movies']")
    WebElement inputMovies;

    @FindBy(xpath = "//input[@value='Hockey']")
    WebElement inputHockey;

    @FindBy(xpath = "//div[@id='msdd']")
    WebElement divLanguage;

    @FindBy(xpath = "//label[text()='Languages']")
    WebElement labelLanguages;

    @FindBy(xpath = "//a[text()='English']")
    WebElement aEnglish;

    @FindBy(xpath = "//select[@ng-model='Skill']")
    WebElement selectSkill;

    @FindBy(xpath = "//select[@ng-model='country']")
    WebElement selectCountry;

    @FindBy(xpath = "//span[@aria-labelledby='select2-country-container']")
    WebElement spanSelectCountry;

    @FindBy(xpath = "//li[text()='United States of America']")
    WebElement liUSA;

    @FindBy(xpath = "//select[@ng-model='yearbox']")
    WebElement selectYearbox;

    @FindBy(xpath = "//select[@ng-model='monthbox']")
    WebElement selectMonthbox;

    @FindBy(xpath = "//select[@ng-model='daybox']")
    WebElement selectDaybox;

    @FindBy(xpath = "//input[@ng-model='Password']")
    WebElement inputPassword;

    @FindBy(xpath = "//input[@ng-model='CPassword']")
    WebElement inputCPassword;

    @FindBy(xpath = "//button[@id='submitbtn']")
    WebElement buttonSubmit;

    @FindBy(xpath = "//button[@id='Button1']")
    WebElement buttonRefresh;

    @FindBy(xpath = "//input[@id='imagesrc']")
    WebElement inputImage;

    public void fillOutForm(){
        inputFirstName.sendKeys("Jane");
        inputLastName.sendKeys("Doe");
        textAreaAdress.sendKeys("5104 O'Hara Plains, Enastad, Montana");
        inputEmailAdress.sendKeys("janedoe@test.com");
        inputPhone.sendKeys("661-696-0799");
        click(inputFeMale);
        click(inputMovies);
        click(divLanguage);
        click(aEnglish);
        click(labelLanguages);
        Select skill = new Select(selectSkill);
        skill.selectByValue("Java");
        Select country = new Select(selectCountry);
        country.selectByVisibleText("Select Country");
        click(spanSelectCountry);

        click(liUSA);
        Select year = new Select(selectYearbox);
        year.selectByValue("1985");
        Select month = new Select(selectMonthbox);
        month.selectByValue("June");
        Select day = new Select(selectDaybox);
        day.selectByValue("5");
    }

}
