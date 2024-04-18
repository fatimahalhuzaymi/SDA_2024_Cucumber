package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HW2 {
    WebDriver driver;

    @Given("I open the browser")
    public void i_open_the_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Given("I am on the testpages")
    public void i_am_on_the_testpages() {
        driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
    }

    @Then("Click ")
    public void Button(String Bname) {
    WebElement button = driver.findElement(By.xpath("//button[text()='"+Bname+"']"));
    button.click();
    }



    @Then("All Buttons Clicked")
    public void All_Buttons_Clicked(String Clicked) {
        WebElement bmess =driver.findElement(By.id("buttonmessage"));
        Assert.assertTrue(bmess.getText().contains(Clicked));
    }


    @Then("I close the browser")
    public void i_close_the_browser() {
        driver.close();


    }
}