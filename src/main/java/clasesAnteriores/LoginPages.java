package clasesAnteriores;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {

    private WebDriver driver;
    //elementos -> PAGE FACTORY
    @FindBy(name = "userName")
    private WebElement userName;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(name = "submit")
    private WebElement btnSubmit;

    //constructor de este objeto
    public LoginPages(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //acciones
    public void ingresarUsuario(String usuario){
        userName.clear();
        userName.sendKeys(usuario);
    }
    public void ingresarPassword(String pass){
        password.clear();
        password.sendKeys(pass);
    }
    public void clickSubmit(){
        btnSubmit.click();
    }
    public void login(String usuario, String pass){
        ingresarUsuario(usuario);
        ingresarPassword(pass);
        clickSubmit();
    }
}
