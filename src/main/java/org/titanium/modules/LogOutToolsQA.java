package org.titanium.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutToolsQA {
    WebDriver driver;

    public LogOutToolsQA(WebDriver driver){
        this.driver = driver;
    }

    public boolean logOut(){
        try {
            String userlabel = driver.findElement(By.id("wp-admin-bar-my-account")).getText();
            System.out.println(userlabel);
            driver.findElement(By.id("account_logout")).click();
        }catch (Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
        return true;
    }
}
