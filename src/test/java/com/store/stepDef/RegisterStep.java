package com.store.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterStep {

    WebDriver driver;
    int TIME_OUT = 15;

    @Before
    public void setup(){
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT));
        driver.manage().window().maximize();
    }

    @Given("visitor is on register page {string}")
    public void visitor_is_on_register_page(String url) {
        driver.get(url);

    }
    @When("user fillout the register form")
    public void user_fillout_the_register_form() {
        driver.findElement(By.id("firstname")).sendKeys("Carla");
        driver.findElement(By.id("lastname")).sendKeys("Contreras");
        driver.findElement(By.id("email_address")).sendKeys("ccontreras@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Sup3rPass");
        driver.findElement(By.id("confirmation")).sendKeys("Sup3rPass");
    }

    @When("user click on register button")
    public void user_click_on_register_button() {
        driver.findElement(By.xpath("//button[@title=\"Register\"]")).submit();

    }
    @Then("user has been registered")
    public void user_has_been_registered() {

        //creo un web element con nombre title
        //driver espera 15 seg
        WebElement title = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT))
                .until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1")));

        //assertion = compara el valor del title
        Assert.assertEquals(title.getText(),"My Dashboard");
    }

    @After
    public void tearDown(){
        driver.quit();
    }





}
