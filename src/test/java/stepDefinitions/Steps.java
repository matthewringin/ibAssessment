package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.testConfig;
import org.apache.commons.io.FileUtils;
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

public class Steps {

    public static WebDriver driver;

    @Given("I open {string}")
    public void i_open_the_site(String site) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver_mac");
        driver = new ChromeDriver();
        driver.get(site);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Given("^I navigate to the Contact Us page$")
    public void user_opens_contactPage() {
        driver.findElement(By.xpath("//a[@title='CONTACT US']")).click();
        driver.manage().window().maximize();
    }

    @When("^I fill in the form fields$")
    public void user_fills_in_fields() {

        driver.findElement(By.xpath("//input[@name='company']")).sendKeys("IB");
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Matt");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ringin");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("matthewringin@gmail.com");

        Select dropdownCountry = new Select(driver.findElement(By.name("country")));
        dropdownCountry.selectByValue("AU");

        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("0451791194");
        driver.findElement(By.xpath("//textarea[@name='enquiry_details']")).sendKeys("please help");

        Select dropdownProduct = new Select(driver.findElement(By.name("product_family")));
        dropdownProduct.selectByValue("DAM");

        driver.findElement(By.name("i_agree_to_intelligencebank_s_terms_and_conditions")).click();

    }
    @Then("^I should take a screenshot to confirm$")
    public void user_takes_screenshot () throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src/test/resources/screenshots/screenshot.png"));
    }
}
