import lt.aruodas.Helper;
import lt.aruodas.Models.Plot;
import lt.aruodas.Models.RealEstate;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PlotTests {

    @Test
    public void buyingRePositiveTest() {
        Plot plot =  new Plot("Vilnius","Vilniaus","Antakalnis","Jaksto","Text","vilniusSklypas.jpg, vilniusSodoSklypas.jpg","","61000898","webdata2023@yahoo.com","12","2356-1245-8965","10","Sklypas soduose","Elektra,Greta misko,Geodeziniai matavimai ");
        plot.fillRe();
        Assert.assertEquals("","");
    }

    public static WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        Helper.driverInit();
        driver = RealEstate.driver;
    }

    @AfterClass
    public void afterClass() {
    //    driver.quit();
    }
}
