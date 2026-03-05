package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryProductosPage extends BasePage{

    private WebDriver driver;
    //elementos -> PAGE FACTORY
    @FindBy(xpath = "//h3[@class=\"poly-component__title-wrapper\"]")
    private WebElement titleProducto;

    //constructor de este objeto
    public SummaryProductosPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //acciones

    public void elegirTalle(){

        click(titleProducto);

    }
}


