import io.github.bonigarcia.wdm.WebDriverManager;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class git LoginTest {

    public static void main(String[] args) {
        System.out.println("-------------------Ejecutando tests de Login------------------------------------");
        testLoginExitoso();

    }
        public static void testLoginExitoso(){
            System.out.println("Test: Login exitoso");
            WebDriver driver = null;

            try {

                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.saucedemo.com/");
                String tagName="";

                driver.manage().deleteAllCookies();
                System.out.println("Todas las cookies han sido eliminadas.");

                tagName=driver.findElement(By.id("user-name")).getTagName();
                System.out.println(tagName + "Id user name identificado");

                WebElement EntradaUserName= driver.findElement(By.id("user-name"));
                EntradaUserName.sendKeys("standard_user");

                WebElement EntradaUserPassword= driver.findElement(By.id("password"));
                EntradaUserPassword.sendKeys("secret_sauce");

                WebElement BotonLogin= driver.findElement(By.id("login-button"));
                BotonLogin.click();

                // driver.quit();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }



}

