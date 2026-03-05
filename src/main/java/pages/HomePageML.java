package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageML extends  BasePage{

    private WebDriver driver;

    // elementos -> PAGE FACTORY
    @FindBy (xpath = "//input[@type=\"text\"]")
    private WebElement inputProductos;

    //Constructor del objeto
    public HomePageML(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void buscarProducto(){
        click(inputProductos);

        clearAndSendKeys(inputProductos, "Pantalones");

        sendKeysEnter(inputProductos);

    }

}
