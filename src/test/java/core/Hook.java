package core;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class Hook {


    public static WebDriver driver;

    @Before
    public void before(){
        SafariOptions options = new SafariOptions();
        driver = new SafariDriver(options);
        Dimension dimension = new Dimension(1920, 1080);
        driver.manage().window().setSize(dimension);
        driver.get("https://demoqa.com");
    }

    @After
    public void after(){
        driver.quit();
    }
}
