package pages;

import core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage extends BasePage {
    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }

    public void clickRadioButton(String id){
        String idRadio = null;
        if(id.equals("Yes")){
            idRadio = "yesRadio";
        }else if(id.equals("Impressive")){
            idRadio = "impressiveRadio";
        }
        click(inputElementByIdLabel(idRadio));
    }

    public void assertRadioButton(String text){
        Assert.assertEquals(text, getTextByTypeText("span", text));
    }
}
