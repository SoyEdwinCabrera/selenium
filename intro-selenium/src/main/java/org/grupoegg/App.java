package org.grupoegg;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        // introSelenium();
        desafio1();
    }
    
    public static void introSelenium(){
        
        // Inicializar Safari WebDriver
        SafariOptions options = new SafariOptions();
        WebDriver superdriver = new SafariDriver(options);        
        
        // Inicializar Chrome WebDriver
        // WebDriver driver = new ChromeDriver();
         
        // Navegar a una página
        superdriver.get("https://facebook.com");
        
        // Minimizar pagina
        superdriver.manage().window().maximize();
        
        // Cambia de pagina
        superdriver.navigate().to("https://github.com");
        
        // Retroceder y avanzar en el navegador
        superdriver.navigate().back();
        superdriver.navigate().forward();
        
        // Maximizar pagina
        superdriver.manage().window().minimize();
        
        superdriver.quit();
    }
    
    public static void desafio1() {
            SafariOptions options = new SafariOptions();
            WebDriver driver = new SafariDriver(options);
    
            try {
                // 1. Navegar a Google
                driver.get("https://www.google.com");
                Thread.sleep(2000);
    
                // 2. Maximizar la ventana
                driver.manage().window().maximize();
                Thread.sleep(2000);
    
                // 3. Navegar a Github
                driver.get("https://www.github.com");
                Thread.sleep(2000);
    
                // 4. Reducir ventana a la mitad y centrar
                java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
                  // Obtiene las dimensiones totales de la pantalla
                int width = screenSize.width / 2;
                int height = screenSize.height / 2;
                  //Divide las dimensiones entre 2 para obtener la mitad
                
                // Calcular posición para centrar
                int x = (screenSize.width - width) / 2;
                int y = (screenSize.height - height) / 2;
                  // Esta fórmula centra la ventana en la pantalla, y los valores posicionaran la ventana en el centro de la pantalla
                  
                  
                // Aplicar nuevo tamaño y posición
                driver.manage().window().setSize(new Dimension(width, height));
                driver.manage().window().setPosition(new Point(x, y));
                Thread.sleep(2000);
    
                // 5. Navegar a Wikipedia
                driver.get("https://www.wikipedia.org");
                Thread.sleep(2000);
    
                // 6. Restaurar tamaño original
                driver.manage().window().maximize();
                Thread.sleep(2000);
    
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // 7. Cerrar el navegador
                driver.quit();
            }
        }    
}
