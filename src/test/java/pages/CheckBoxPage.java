package pages;

import core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends BasePage {
    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@title='Expand all']")
    WebElement buttonExpandAll;


    public void clickOnSeparateCheckBoxes(){
        click(buttonExpandAll);
        click(checkBoxParentElement("tree-node-notes"));
        click(checkBoxParentElement("tree-node-commands"));
        click(checkBoxParentElement("tree-node-react"));
        click(checkBoxParentElement("tree-node-angular"));
        click(checkBoxParentElement("tree-node-veu"));
        click(checkBoxParentElement("tree-node-public"));
        click(checkBoxParentElement("tree-node-private"));
        click(checkBoxParentElement("tree-node-classified"));
        click(checkBoxParentElement("tree-node-general"));
        click(checkBoxParentElement("tree-node-wordFile"));
        click(checkBoxParentElement("tree-node-excelFile"));
    }

    public void youHaveSelected(){
        boolean notes = isSelected(inputElementById("tree-node-notes"));
        boolean commands = isSelected(inputElementById("tree-node-commands"));
        boolean desktop = isSelected(inputElementById("tree-node-desktop"));
        boolean react = isSelected(inputElementById("tree-node-react"));
        boolean angular = isSelected(inputElementById("tree-node-angular"));
        boolean veu = isSelected(inputElementById("tree-node-veu"));
        boolean workspace = isSelected(inputElementById("tree-node-workspace"));
        boolean publicBol = isSelected(inputElementById("tree-node-public"));
        boolean privateBol = isSelected(inputElementById("tree-node-private"));
        boolean classified = isSelected(inputElementById("tree-node-classified"));
        boolean general = isSelected(inputElementById("tree-node-general"));
        boolean office = isSelected(inputElementById("tree-node-office"));
        boolean documents = isSelected(inputElementById("tree-node-documents"));
        boolean wordFile = isSelected(inputElementById("tree-node-wordFile"));
        boolean excelFile = isSelected(inputElementById("tree-node-excelFile"));
        boolean downloads = isSelected(inputElementById("tree-node-downloads"));
        boolean home = isSelected(inputElementById("tree-node-home"));

        if(notes){
            Assert.assertEquals("notes", findElementUsingText("span", "notes").getText());
        }
        if(commands){
            Assert.assertEquals("commands", findElementUsingText("span", "commands").getText());
        }
        if(notes && commands){
            Assert.assertEquals("desktop", findElementUsingText("span", "desktop").getText());
        }
        if(react){
            Assert.assertEquals("react", findElementUsingText("span", "react").getText());
        }
        if(angular){
            Assert.assertEquals("angular", findElementUsingText("span", "angular").getText());
        }
        if(veu){
            Assert.assertEquals("veu", findElementUsingText("span", "veu").getText());
        }
        if(react && angular && veu){
            Assert.assertEquals("workspace", findElementUsingText("span", "workspace").getText());
        }
        if(publicBol){
            Assert.assertEquals("public", findElementUsingText("span", "public").getText());
        }
        if(privateBol){
            Assert.assertEquals("private", findElementUsingText("span", "private").getText());
        }
        if(classified){
            Assert.assertEquals("classified", findElementUsingText("span", "classified").getText());
        }
        if(general){
            Assert.assertEquals("general", findElementUsingText("span", "general").getText());
        }
        if(publicBol && privateBol && classified && general){
            Assert.assertEquals("office", findElementUsingText("span", "office").getText());
        }
        if(wordFile){
            Assert.assertEquals("wordFile", findElementUsingText("span", "wordFile").getText());
        }
        if(excelFile){
            Assert.assertEquals("excelFile", findElementUsingText("span", "excelFile").getText());
        }
        if(workspace && office){
            Assert.assertEquals("documents", findElementUsingText("span", "documents").getText());
        }
        if(desktop && documents && downloads){
            Assert.assertEquals("home", findElementUsingText("span", "home").getText());
        }
    }
}
