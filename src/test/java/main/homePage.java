package main;

import org.openqa.selenium.By;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class homePage extends testConfig {

    @Test (priority = 1)
    @Parameters ({ "baseURL" })
    public void openIB(String baseURL) {
        driver.get(baseURL);
    }

    @Test  (priority = 2)
    public void contactPage() {
        driver.findElement(By.xpath("//a[@title='CONTACT US']")).click();
        driver.manage().window().maximize();
    }
}
