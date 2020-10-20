package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.testConfig;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;

public class Steps extends testConfig {

    @Given("^I open the Intelligencebank site$")
    @Parameters({ "baseURL" })
    public void user_opens_ib(String baseURL) {
        main.homePage.openIB(baseURL);
    }

    @Given("^I navigate to the Contact Us page$")
    public void user_opens_contactPage() {
        main.homePage.contactPage();
    }

    @When("^I fWill in the form fields$")
    @Parameters ({ "company,firstName,lastName,email,country,phone,enquiry,product"})
    public void user_fills_in_fields(String company,String firstName,String lastName,String email,String country,String phone,String enquiry,String product) {

        main.contactPage.addCompany(company);
        main.contactPage.addFirstName(firstName);
        main.contactPage.addLastName(lastName);
        main.contactPage.addEmail(email);
        main.contactPage.selectCountry(country);
        main.contactPage.addPhone(phone);
        main.contactPage.addEnquiry(enquiry);
        main.contactPage.selectProduct(product);
        main.contactPage.clickCheckbox();

    }
    @Then("^I should take a screenshot to confirm$")
    public void user_takes_screenshot () throws IOException {
        main.contactPage.takeScreenshot();
    }
}
