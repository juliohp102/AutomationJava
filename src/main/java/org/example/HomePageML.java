package org.example;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageML {

    private WebDriver driver;
    //elementos -> PAGE FACTORY
    @FindBy(xpath = "//input[@type=\"text\"]")
    private WebElement inputProductos;

    //constructor de este objeto
    public HomePageML(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //acciones

    public void buscarProducto(){

        inputProductos.click();
        inputProductos.sendKeys("Pantalones");
        inputProductos.sendKeys(Keys.ENTER);
    }

}
