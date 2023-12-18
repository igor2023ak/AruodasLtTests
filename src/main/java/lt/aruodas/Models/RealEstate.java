package lt.aruodas.Models;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;

public class RealEstate {
    public String region;
    public String settlement;
    public String microdistrict;
    public String street;
    public String description;
    public String imageUrl;
    public String price;
    public String phone;
    public String email;


    public static WebDriver driver;
    public static WebDriverWait wait;

    public RealEstate(String region, String settlement, String microdistrict, String street, String description, String imageUrl, String price, String phone, String email) {
        this.region = region;
        this.settlement = settlement;
        this.microdistrict = microdistrict;
        this.street = street;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
        this.phone = phone;
        this.email = email;
    }

    public void fillRe() {
        setLocation();
        setDescription();
        setImageUrl();
        setPrice();
        setContacts();
        clickCheckboxes();
    }
    public void clickCheckboxes(){                                                                      // sutikimo varneles
        List<WebElement> rows = driver.findElement(By.id("newObjectForm")).findElements(By.tagName("li"));
        rows.get(rows.size() - 3 ).findElements(By.tagName("span")).get(1).click();
        rows.get(rows.size() - 4 ).findElement(By.tagName("span")).click();
        rows.get(rows.size() - 5 ).findElement(By.tagName("span")).click();
    }

    public void setLocation() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[3]/span[1]/span")).click();     // region
        driver.findElement(By.xpath("//*[@id=\"regionDropdown\"]/li[1]/input")).sendKeys(this.region);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        driver.findElement(By.xpath("//*[@id=\"regionDropdown\"]/li[1]/input")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"district\"]/span")).click();                                       // settlement
        driver.findElement(By.xpath("//*[@id=\"districts_461\"]/li[1]/input")).sendKeys(this.settlement);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        driver.findElement(By.xpath("//*[@id=\"districts_461\"]/li[89]")).click();
        driver.findElement(By.xpath("//*[@id=\"quartalTitle\"]")).click();                             // microdistrict
        driver.findElement(By.xpath("//*[@id=\"quartals_1\"]/li[1]/input")).sendKeys(this.microdistrict);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        driver.findElement(By.xpath("//*[@id=\"quartals_1\"]/li[1]/input")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"streetTitle\"]")).click();                                // street
        driver.findElement(By.xpath("//*[@id=\"streets_1\"]/li[1]/input")).sendKeys(this.street);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        driver.findElement(By.xpath("//*[@id=\"streets_1\"]/li[1]/input")).sendKeys(Keys.ENTER);
    }

    public void setDescription() {
        driver.findElement(By.name("notes_lt")).sendKeys(this.description);   //      description
    }

    public void setImageUrl() {                                                                                           // photos
        this.imageUrl = this.imageUrl.replace(" ","");
        String[] photos = this.imageUrl.split(",");
        for (String photo: photos) {
            File resourceFile = new File("images/" + photo);
            driver.findElement(By.xpath("//*[@id=\"uploadPhotoBtn\"]/input")).sendKeys(resourceFile.getAbsolutePath());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setPrice() {
        driver.findElement(By.id("priceField")).sendKeys("190000");       // price
    }

    public void setContacts() {
        driver.findElement(By.name("phone")).sendKeys("61000898");                    // phone
        driver.findElement(By.name("email")).sendKeys("webdata2023@yahoo.com");       // email
    }
}
