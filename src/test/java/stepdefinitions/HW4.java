package stepdefinitions;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class HW4{
    WebDriver driver;

    @Given("the user navigate to the page ")
    public void the_user_navigate_to_the_pagr(String url) {
       Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("the user waits for 5 seconds")
    public void  the_user_waits(int sec)throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

    }

    @Then("the user verifies")
    public void verifies(String pages){
        String page = Driver.getDriver().getTitle();
        System.out.println(page);
        Assert.assertTrue(page.contains(pages));
    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        driver.close();
    }
}