package org.grupo12;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App 
{
    public static void main( String[] args )
    {
        localizarTagClassAtribute();
    }
    
    public static void localizarTagId() {

        WebDriver superDriver = new ChromeDriver();
        superDriver.get("https://google.com");
        superDriver.manage().window().maximize();

        try {
        Thread.sleep(3000);
        WebElement inputGoogle = superDriver.findElement(By.cssSelector("textarea#APjFqb"));
        inputGoogle.click();
        inputGoogle.sendKeys("hello world");
        Thread.sleep(2000);
        } catch(Exception e){
            System.out.println("Error: ");
        } finally {
        superDriver.quit();
        }
    }
    
    public static void localizarTagClass(){
        
        WebDriver superDriver = new SafariDriver();
        superDriver.manage().window().maximize();
        superDriver.get("https://tiendamia.com/ec");
        
        try{            
            WebElement tagClass = superDriver.findElement(By.cssSelector("div.header container"));
            tagClass.click();    
            Thread.sleep(3000);
        } catch (Exception e){
            System.out.println("Error: ");
        } finally {
        superDriver.quit();
        }
    }
    
    public static void localizarTagAtribute(){
        
        WebDriver superDriver = new SafariDriver();
        superDriver.manage().window().maximize();
        superDriver.get("https://google.com");
        
        try{            
            WebElement tagAtribute = superDriver.findElement(By.cssSelector("a[target=_top]"));
            tagAtribute.click();    
            Thread.sleep(3000);
        } catch (Exception e){
            System.out.println("Error: ");
        } finally {
        superDriver.quit();
        }
    }
    
    public static void localizarTagClassAtribute(){
        
        WebDriver superDriver = new SafariDriver();
        WebDriverWait wait = new WebDriverWait(superDriver, Duration.ofSeconds(10));
        superDriver.manage().window().maximize();
        superDriver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.text-color-text[autocomplete=current-password]")));
        
        try{            
            WebElement tagClassAtribute = superDriver.findElement(By.cssSelector("input.text-color-text[autocomplete=current-password]"));
            tagClassAtribute.sendKeys("hello");    
            Thread.sleep(5000);
        } catch (Exception e){
            System.out.println("Error al localizar elemento: " + e.getMessage());
        } finally {
            if (superDriver != null){
                superDriver.quit();
            }
        }
    }
}
