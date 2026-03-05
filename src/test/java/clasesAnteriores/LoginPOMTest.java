package clasesAnteriores;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPOMTest {

    WebDriver driver = null;
    private static final String BASE_URL = "https://demo.guru99.com/test/newtours/index.php";

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @Test
    public void testLoginExitoso(){
        //instanciar la page LoginPage usando Page Factory
        LoginPages loginPage = new LoginPages(driver);
        loginPage.login("pedro", "123");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
