package OtrasClases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class registroTest {
    WebDriver driver = null;

    @BeforeTest
    public void setUp(){
        System.out.println("---Ejecutando la configuración---");
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/");


    }
    @Test
    public void resgistroExitoso(){

        WebElement paginaRegistro;;
        paginaRegistro = driver.findElement(By.linkText("register.php"));

        /*

        System.out.println("---Ejecutando el Test---");
        driver.findElement(By.name("firstName")).sendKeys("julio");
        driver.findElement(By.name("lastName")).sendKeys("hernandez");
        driver.findElement(By.name("phone")).sendKeys("5521015549");
        driver.findElement(By.name("userName")).sendKeys("juliohp102@hotmail.com");
        driver.findElement(By.name("address1")).sendKeys("Isla creciente 102");
        driver.findElement(By.name("city")).sendKeys("Prado Vallejo");
        driver.findElement(By.name("postalCode")).sendKeys("54170");
        driver.findElement(By.name("email")).sendKeys("juliohp102");
        driver.findElement(By.name("password")).sendKeys("Lucecit0");
        driver.findElement(By.name("confirmPassword")).sendKeys("Lucecit0");
        driver.findElement(By.name("submit")).click();

        */

    }
    @AfterTest
    public void tearDown (){
        //driver.quit();
        System.out.println("---Ejecutando cierre del Test---");
    }
}
