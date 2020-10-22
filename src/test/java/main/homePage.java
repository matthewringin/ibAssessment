package main;

import org.openqa.selenium.By;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class homePage extends testConfig {

    @Parameters ({ "baseURL" })
    public static void openIB(String baseURL) {
        driver.get(baseURL);
    }

    public static void contactPage() {
        driver.findElement(By.xpath("//a[@title='CONTACT US']")).click();
        driver.manage().window().maximize();
    }
}
