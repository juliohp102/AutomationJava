
import org.example.HomePageML;
import org.example.SummaryProductosPage;

import org.testng.annotations.*;
import pages.ProductosPage;

public class BusquedaProductosML extends BaseTestNG {
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
