import lt.aruodas.Helper;
import lt.aruodas.Models.BuyingRe;
import lt.aruodas.Models.RealEstate;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BuyingReTests {

    @Test
    public void buyingRePositiveTest() {
        BuyingRe re =  new BuyingRe("Vilnius","Vilniaus","Antakalnis","Jaksto","Text","megamaja.jpg","","61000898","webdata2023@yahoo.com","Butai nuomotis");
        re.fillRe();
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
