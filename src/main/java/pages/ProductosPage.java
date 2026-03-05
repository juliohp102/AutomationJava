package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductosPage extends BasePage{


    private WebDriver driver;
    //elementos -> PAGE FACTORY
    @FindBy(xpath = "(//span[contains(text(),\"Elige\")])[1]")
    private WebElement comboBoxElegirTalle;

    @FindBy(xpath = "(//a[@class=\"ui-pdp-outside_variations__thumbnails__item ui-pdp-outside_variations__thumbnails__item--NONE ui-pdp-outside_variations__thumbnails__item--with-details\"])[1]")
    private WebElement talle;



    //constructor de este objeto
    public ProductosPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //acciones

    public void elegirTalle(){

        click(comboBoxElegirTalle);
        click(talle);

    }

}
