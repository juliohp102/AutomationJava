import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.FligthPages;
import org.example.pages.HomePage;
import org.example.pages.LoginPages;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightsPOMTest {

    WebDriver driver = null;
    private static final String BASE_URL = "https://demo.guru99.com/test/newtours/index.php";

    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @Test
    public void testBuscarVuelo(){
        //instanciar la page LoginPage usando Page Factory
        LoginPages loginPage = new LoginPages(driver);
        loginPage.login("pedro", "123");

        HomePage homePage =new HomePage(driver);
        homePage.clickFlight();

        FligthPages flightsPage = new FligthPages(driver);
        flightsPage.clickContinuar();
    }
    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
