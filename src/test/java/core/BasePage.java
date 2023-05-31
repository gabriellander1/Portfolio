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

    public BasePage(WebDriver driver){
        this.driver = driver;
        //wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public void waitVisibility(WebElement element){
        element = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(element));
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

    public String getTextByTypeText(String type, String value){
        return findElementUsingText(type, value).getText();
    }

    public String getTextByTypeAttributeValue(String type, String attribute, String value){
        return driver.findElement(By.xpath("//" + type + "[@" + attribute + "='" + value + "']")).getText();
    }
    public boolean isSelected(WebElement element){
        return element.isSelected();
    }

    public WebElement checkBoxParentElement(String id){
        return driver.findElement(By.xpath("//input[@id='"+id+"']//parent::label"));
    }

    public WebElement inputElementById(String id){
        return driver.findElement(By.xpath("//input[@id='"+id+"']"));
    }

    public WebElement inputElementByIdLabel(String id){
        return driver.findElement(By.xpath("//input[@id='" + id + "']//parent::div//label"));
    }
}



