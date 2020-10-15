package main;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;

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

    @Parameters ({ "baseURL" })
    @Test (priority=1)
    public void openIB(String baseURL) {
        driver.get(baseURL);
    }

    @Test (priority=2)
    public void contactPage() {
        driver.findElement(By.xpath("//a[@title='CONTACT US']")).click();
        driver.manage().window().maximize();
    }

    @Test (priority=3)
    @Parameters ({ "company","firstName","lastName","email","country","phone","product","enquiry"})
    public void fillIn(String company,String firstName,String lastName,String email,String country, String phone,String product,String enquiry) {
        driver.findElement(By.xpath("//input[@name='company']")).sendKeys(company);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);

        Select dropdownCountry = new Select(driver.findElement(By.name("country")));
        dropdownCountry.selectByValue(country);

        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
        driver.findElement(By.xpath("//textarea[@name='enquiry_details']")).sendKeys(enquiry);

        Select dropdownProduct = new Select(driver.findElement(By.name("product_family")));
        dropdownProduct.selectByValue(product);

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
