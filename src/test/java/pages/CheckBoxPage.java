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
        boolean notes = isSelected(checkBoxElement("tree-node-notes"));
        boolean commands = isSelected(checkBoxElement("tree-node-commands"));
        boolean desktop = isSelected(checkBoxElement("tree-node-desktop"));
        boolean react = isSelected(checkBoxElement("tree-node-react"));
        boolean angular = isSelected(checkBoxElement("tree-node-angular"));
        boolean veu = isSelected(checkBoxElement("tree-node-veu"));
        boolean workspace = isSelected(checkBoxElement("tree-node-workspace"));
        boolean publicBol = isSelected(checkBoxElement("tree-node-public"));
        boolean privateBol = isSelected(checkBoxElement("tree-node-private"));
        boolean classified = isSelected(checkBoxElement("tree-node-classified"));
        boolean general = isSelected(checkBoxElement("tree-node-general"));
        boolean office = isSelected(checkBoxElement("tree-node-office"));
        boolean documents = isSelected(checkBoxElement("tree-node-documents"));
        boolean wordFile = isSelected(checkBoxElement("tree-node-wordFile"));
        boolean excelFile = isSelected(checkBoxElement("tree-node-excelFile"));
        boolean downloads = isSelected(checkBoxElement("tree-node-downloads"));
        boolean home = isSelected(checkBoxElement("tree-node-home"));

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