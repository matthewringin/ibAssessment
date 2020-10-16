package main;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class testConfig {

    public static WebDriver driver;

    @BeforeTest
    public void setBrowserConfig() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver_mac");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterTest
    public void exitBrowser() {
        driver.quit();
    }
}
