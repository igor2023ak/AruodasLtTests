import lt.aruodas.Helper;
import lt.aruodas.Models.FlatSold;
import lt.aruodas.Models.RealEstate;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlatSoldTests {

    @Test
    public void buyingRePositiveTest() {
        FlatSold flatSold = new FlatSold("Vilnius","Vilniaus","Antakalnis","Jaksto","Text","Namas.jpg, NamoPlanas.jpg","190000","61000898","webdata2023@yahoo.com","150","3","10","2023","Namas gyvenamasis","Blokinis","Daline apdaila","Elektra,Geoterminis");
        flatSold.fillRe();
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
