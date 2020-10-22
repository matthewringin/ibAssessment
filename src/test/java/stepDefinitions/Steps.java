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
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Given("I navigate to the {string} page")
    public void user_opens_contactPage(String page) {
        driver.findElement(By.xpath("//a[@title='" + page + "']")).click();
    }

    @When("I type {string} into the company field")
    public void user_fills_in_company_fields(String company) {
        driver.findElement(By.xpath("//input[@name='company']")).sendKeys(company);
    }

    @When("I type {string} into the first name field")
    public void user_fills_in_first_name_field(String firstName) {

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName);

    }

    @When("I type {string} into the last name field")
    public void user_fills_in_last_name_field(String lastName) {

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);

    }

    @When("I type {string} into the email field")
    public void user_fills_in_email_field(String email) {

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);

    }

    @When("I select {string} in the country selector")
    public void user_selects_country_in_country_selector(String country) {

        Select dropdownCountry = new Select(driver.findElement(By.name("country")));
        dropdownCountry.selectByValue(country);
    }

    @When("I type {string} into the phone field")
    public void user_fills_in_phone_field(String phone) {

        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
    }

    @When("I type {string} into the enquiry field")
    public void user_fills_in_enquiry_field(String enquiry) {

        driver.findElement(By.xpath("//textarea[@name='enquiry_details']")).sendKeys(enquiry);
    }

    @When("I select {string} in the product selector")
    public void user_selects_product_in_product_selector(String product) {

        Select dropdownProduct = new Select(driver.findElement(By.name("product_family")));
        dropdownProduct.selectByValue(product);
    }
    @When("^I click the checkbox$")
    public void user_clicks_the_checkbox() {

        driver.findElement(By.name("i_agree_to_intelligencebank_s_terms_and_conditions")).click();
    }

    @Then("^I should take a screenshot to confirm and close the site$")
    public void user_takes_screenshot () throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src/test/resources/screenshots/screenshot.png"));

        driver.quit();
    }
}
