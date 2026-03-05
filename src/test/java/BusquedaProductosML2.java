import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.HomePageML;
import org.example.SummaryProductosPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ProductosPage;

public class BusquedaProductosML2 extends BaseTestNG
{
    WebDriver driver = null;
    private static final String BASE_URL = "https://www.mercadolibre.com.mx/";

    @BeforeMethod
    public void openPage(){

        driver.get(BASE_URL);
    }
    @Test
    public void testBusquedaProducto(){
        //instanciar la page HomePageML usando Page Factory
        HomePageML homeML = new HomePageML(driver);
        homeML.buscarProducto();

        SummaryProductosPage summaryProductosML = new SummaryProductosPage(driver);
        summaryProductosML.clicAlPrimerProducto();

        ProductosPage productosML = new ProductosPage(driver);
        productosML.elegirTalle();

    }
}
