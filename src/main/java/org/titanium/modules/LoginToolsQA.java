package org.titanium.modules;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginToolsQA {

    WebDriver driver;

    public LoginToolsQA(WebDriver driver) {
        this.driver = driver;
    }

    public boolean logIn(String user, String pass){

        try {
            driver.findElement(By.id("account")).click();
            driver.findElement(By.id("log")).sendKeys(user);
            driver.findElement(By.id("pwd")).sendKeys(pass);
            driver.findElement(By.id("login")).click();
        }catch (Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }

        return true;

    }

}
