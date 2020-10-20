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

    public static void addCompany(String company) {
        driver.findElement(By.xpath("//input[@name='company']")).sendKeys(company);
    }

    public static void addFirstName(String firstName) {
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName);
    }

    public static void addLastName(String lastName) {
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
    }

    public static void addEmail(String email) {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
    }


    public static void selectCountry(String country) {
        Select dropdownCountry = new Select(driver.findElement(By.name("country")));
        dropdownCountry.selectByValue(country);
    }

    public static void addPhone(String phone) {

        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
    }

    public static void addEnquiry(String enquiry) {
        driver.findElement(By.xpath("//textarea[@name='enquiry_details']")).sendKeys(enquiry);
    }

    public static void selectProduct(String product) {
        Select dropdownProduct = new Select(driver.findElement(By.name("product_family")));
        dropdownProduct.selectByValue(product);
    }

    public static void clickCheckbox() {
        driver.findElement(By.name("i_agree_to_intelligencebank_s_terms_and_conditions")).click();
    }

    public static void takeScreenshot() throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src/test/resources/screenshots/screenshot.png"));
    }
}
