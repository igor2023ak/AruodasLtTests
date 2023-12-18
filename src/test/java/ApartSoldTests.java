import lt.aruodas.Helper;
import lt.aruodas.Models.ApartSold;
import lt.aruodas.Models.RealEstate;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ApartSoldTests {

    @Test
    public void buyingRePositiveTest() {
        ApartSold apartSold = new ApartSold("Vilnius","Vilniaus","Antakalnis","Jaksto","Text","pirmasAukstas.jpg, antrasAukstas.jpg, SvetainePoilsio.jpg","860000","","","30","17","2121-5656-4535:1561","125","6","2","11","2000","2023","Monolitinis","Daline Apdaila","Elektra,Centrinis kolektorinis,Saules energija","Poilsio","Aukstos lubos,Butas per kelis aukstus,Tualetas ir vonia atskirai,Internetas,Kabeline televizija,Virtuve sujungta su kambariu","Sandeliukas,Drabuzine,Vieta automobiliui","Kondicionerius,Skalbimo masina,Saldytuvas,Virtuves komplektas,Indaplove,Duso kabina","Sarvuotos durys,Signalizacija,Kodine laiptines spyna,Vaizdo kameros","A+,Varzytynes/aukcionas");
        apartSold.fillRe();
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
