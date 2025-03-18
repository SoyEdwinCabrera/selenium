package org.grupo10;

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
        desafio2();      
    }
    
    public static void wikipedia(){
        // Inicializar SafariWebDriver
        //WebDriver superDriver = new SafariDriver();
        
        // Inicializar ChromeWebDriver
        WebDriver superDriver = new ChromeDriver();
        
        superDriver.get("https://wikipedia.org");
        superDriver.manage().window().maximize();
        
        superDriver.quit();
    }
    
    public static void localizacionId(){
        
        WebDriver superDriver =  new ChromeDriver();
        superDriver.manage().window().maximize();        
        superDriver.get("https://wikipedia.org");
        
        try {
            WebElement englishOption = superDriver.findElement(By.id("js-link-box-en"));
            Thread.sleep(4000);
            englishOption.click();            
        } catch (Exception e){
            System.out.println("No cariño, no se encuentra el elemento: " + e.getMessage());
        }
        superDriver.quit();
    }
    
    public static void localizacionName(){
        
        WebDriver superDriver = new SafariDriver();
        superDriver.manage().window().maximize();
        superDriver.get("https://github.com");
        
        try {
            WebElement searchInput = superDriver.findElement(By.name("user_email"));
            searchInput.sendKeys("testdeprueba@selenium.com");
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            superDriver.quit();
        } 
    }
    
    public static void localizacionLinkTest(){
        
        WebDriver superDriver = new ChromeDriver();
        superDriver.manage().window().maximize();
        superDriver.get("https://github.com");
        
        try{
            WebElement signUpButton = superDriver.findElement(By.partialLinkText("Sign in"));
            signUpButton.click();
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            superDriver.quit();
        }
        
    }
    
    
    public static void desafio2() {
        // Inicializar el WebDriver
        WebDriver driver = new SafariDriver();
        // Crear un objeto WebDriverWait para esperas explícitas
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Maximizar ventana
            driver.manage().window().maximize();

            // Paso 1: Iniciar sesión en Hotmail
            driver.get("https://login.live.com");
            
            // Login email
            WebElement emailInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("i0116")));
            emailInput.sendKeys("corredeprueba@hotmail.com");
            driver.findElement(By.id("idSIButton9")).click();

            // Login password
            WebElement passwordInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("i0118")));
            passwordInput.sendKeys("correodePrueba123");
            driver.findElement(By.id("idSIButton9")).click();
            Thread.sleep(2000);

            // Paso 2: Navegar a Wikipedia
            driver.get("https://www.wikipedia.org");
            Thread.sleep(2000);

            // Paso 3: Buscar elemento químico
            WebElement searchInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("searchInput")));
            searchInput.sendKeys("Oxígeno");
            WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));
            searchButton.click();
            Thread.sleep(3000);

            // Paso 4: Navegar a la RAE
            driver.get("https://dle.rae.es/");
            Thread.sleep(2000);

            // Paso 5: Buscar palabra en la RAE
            WebElement raeSearchInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("w")));
            raeSearchInput.sendKeys("felicidad");
            WebElement raeSearchButton = driver.findElement(By.cssSelector("button[type='submit']"));
            raeSearchButton.click();
            Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println("Se produjo un error durante la ejecución: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Paso 6: Cerrar navegador
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
