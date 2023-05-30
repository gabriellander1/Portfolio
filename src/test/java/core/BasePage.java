package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        //wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public void waitVisibility(WebElement element){
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

    public void click(WebElement element){
        waitVisibility(element);
        element.click();
    }

    public void sendKeys(WebElement element, String value){
        waitVisibility(element);
        element.sendKeys(value);
    }

    public WebElement findElementUsingText(String type, String value){
        return driver.findElement(By.xpath("//"+ type + "[text()='"+ value +"']"));
    }

    public String getText(String type, String attribute, String value){
        return driver.findElement(By.xpath("//" + type + "[@" + attribute + "='" + value + "']")).getText();
    }
}



