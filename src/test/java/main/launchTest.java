package main;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class launchTest {

    static WebDriver driver;

    @BeforeClass
    public void setBrowserConfig() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver_mac");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test (priority=1)
    public void openIB() {
        driver.get("https://www.intelligencebank.com/");
    }

    @Test (priority=2)
    public void contactPage() {
        driver.findElement(By.xpath("//a[@title='CONTACT US']")).click();
        driver.manage().window().maximize();
    }

    @Test (priority=3)
    public void fillIn() {
        driver.findElement(By.xpath("//input[@name='company']")).sendKeys("IntelligenceBank");
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Matt");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ringin");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("matthew.ringin@intelligencebank.com");

        Select dropdownCountry = new Select(driver.findElement(By.name("country")));
        dropdownCountry.selectByValue("AU");

        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("0451 791 194");
        driver.findElement(By.xpath("//textarea[@name='enquiry_details']")).sendKeys("Testing");

        Select dropdownProduct = new Select(driver.findElement(By.name("product_family")));
        dropdownProduct.selectByValue("DAM");

        driver.findElement(By.name("i_agree_to_intelligencebank_s_terms_and_conditions")).click();
    }

    @Test (priority=4)
    public void takeScreenshot () throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src/test/resources/screenshots/screenshot.png"));
    }

    @AfterClass
    public static void exitBrowser() {
        driver.quit();
    }

}
