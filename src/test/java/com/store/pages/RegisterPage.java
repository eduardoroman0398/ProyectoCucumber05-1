package com.store.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    //identificacion de elementos

    //constructor

    //metodos

    public void registerForm(){
        driver.findElement(By.id("firstname")).sendKeys("Carla");
        driver.findElement(By.id("lastname")).sendKeys("Contreras");
        driver.findElement(By.id("email_address")).sendKeys("ccontreras@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Sup3rPass");
        driver.findElement(By.id("confirmation")).sendKeys("Sup3rPass");
    }
}

