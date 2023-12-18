import lt.aruodas.Helper;
import lt.aruodas.Models.Premises;
import lt.aruodas.Models.RealEstate;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PremisesTests {

    @Test
    public void buyingRePositiveTests() {
        Premises premises = new Premises("Vilnius","Vilniaus","Antakalnis","Juozapaviciaus","Text","svetaine.jpg, megamaja.jpg","90000","","","30","17","1234-4562-2563:2563","89","8","2021","Irengtas","Viesbuciu");
        premises.fillRe();
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
