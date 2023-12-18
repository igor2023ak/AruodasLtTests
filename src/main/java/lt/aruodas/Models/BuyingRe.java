package lt.aruodas.Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BuyingRe extends RealEstate {

    public String objectType;

    public BuyingRe(String region, String settlement, String microdistrict, String street, String description, String imageUrl, String price, String phone, String email, String objectType) {
        super(region, settlement, microdistrict, street, description, imageUrl, price, phone, email);
        this.objectType = objectType;
        
    }

    @Override
    public void fillRe() {
        driver.get("https://aruodas.lt/ideti-skelbima/?obj=10");
        super.fillRe();
        setObjecttype();
        //driver.findElement(By.id("submitFormButton")).click();                                                                    // create
    }

    public void setObjecttype() {    // dlia togo stobi bilo vpisano "nazvanie" v ssilke dolzni prisutstvovat slashi(\"...\")
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/input[2]")).click();                // Object type
        List<WebElement> objectTypes = driver.findElement(By.className("dropdown-input-values")).findElements(By.tagName("li"));
        for (WebElement objectType : objectTypes) {
            if (objectType.getText().equalsIgnoreCase(this.objectType)) {
                objectType.click();
                break;
            }
        }
    }
}
