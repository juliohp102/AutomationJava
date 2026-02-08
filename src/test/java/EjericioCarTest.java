import io.github.bonigarcia.wdm.WebDriverManager;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class EjericioCarTest{

    public static void main(String[] args) {
        System.out.println("-------------------Ejecutando Carrito------------------------------------");
        testAddItem();

    }
    public static void testAddItem(){
        System.out.println("Test: Agregar producto al carrito");
        WebDriver driver = null;

        try {

            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");
            String tagName="";

            WebElement EntradaUserName= driver.findElement(By.id("user-name"));
            EntradaUserName.sendKeys("standard_user");

            WebElement EntradaUserPassword= driver.findElement(By.id("password"));
            EntradaUserPassword.sendKeys("secret_sauce");

            WebElement BotonLogin= driver.findElement(By.id("login-button"));
            BotonLogin.click();

            WebElement btnAddtoCar= driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
            btnAddtoCar.click();

            WebElement btnGoToCar = driver.findElement(By.className("shopping_cart_container"));
            btnGoToCar.click();

            WebElement itemInCart = driver.findElement(By.className("inventory_item_name"));

            String titleItem =itemInCart.getText();

            WebElement numberInCart = driver.findElement(By.className("shopping_cart_badge"));
            String numberShoppingCarBadge = numberInCart.getText();

            if (titleItem.equals("Sauce Labs Backpack") && numberShoppingCarBadge.equals("1")){
                System.out.println("----PASSED---");
                System.out.println(titleItem);
                System.out.println(numberShoppingCarBadge);
            } else {
                System.out.println("----FAILED---");
            }

            // driver.quit();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}

