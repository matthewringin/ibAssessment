package main;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class contactPage extends testConfig {

    @Test(priority = 3)
    @Parameters({ "company" })
    public void addCompany(String company) {
        driver.findElement(By.xpath("//input[@name='company']")).sendKeys(company);
    }

    @Test(priority = 4)
    @Parameters({ "firstName" })
    public void addFirstName(String firstName) {
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName);
    }

    @Test(priority = 5)
    @Parameters({ "lastName" })
    public void addLastName(String lastName) {
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
    }

    @Test(priority = 6)
    @Parameters({ "email" })
    public void addEmail(String email) {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
    }

    @Test(priority = 7)
    @Parameters({ "country" })
    public void selectCountry(String country) {
        Select dropdownCountry = new Select(driver.findElement(By.name("country")));
        dropdownCountry.selectByValue(country);
    }

    @Test(priority = 8)
    @Parameters({ "phone" })
    public void addPhone(String phone) {
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
    }

    @Test(priority = 8)
    @Parameters({ "enquiry" })
    public void addEnquiry(String enquiry) {
        driver.findElement(By.xpath("//textarea[@name='enquiry_details']")).sendKeys(enquiry);
    }

    @Test(priority = 9)
    @Parameters({ "product" })
    public void selectProduct(String product) {
        Select dropdownProduct = new Select(driver.findElement(By.name("product_family")));
        dropdownProduct.selectByValue(product);
    }

    @Test(priority = 10)
    @Parameters({ "product" })
    public void clickCheckbox(String product) {
        driver.findElement(By.name("i_agree_to_intelligencebank_s_terms_and_conditions")).click();
    }

    @Test (priority = 11)
    public void takeScreenshot () throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src/test/resources/screenshots/screenshot.png"));
    }
}
