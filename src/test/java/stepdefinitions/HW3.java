package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HW3 {
    WebDriver driver;

    @Given("I open the browser")
    public void i_open_the_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Given("I am on the testpages")
    public void i_am_on_the_testpages() {
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
    }

    @When(" I fill first and last name")
    public void  I_fill_first_and_last_name() {

        driver.findElement(By.id("firstname")).sendKeys("firstname"+Keys.ENTER);
        driver.findElement(By.id("surname")).sendKeys("lastname"+Keys.ENTER);
        driver.findElement(By.id("age")).sendKeys("age"+Keys.ENTER);
    }

    @Then("I should see Validation Report")
    public void  i_should_see_on_the_results() {
        Assert.assertTrue(driver.findElements(By.tagName("Input Validation Response")).isEmpty());
    }


    @Then("I close the browser")
    public void i_close_the_browser() {
        driver.close();
    }
}