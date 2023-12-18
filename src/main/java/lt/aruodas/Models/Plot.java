package lt.aruodas.Models;

import org.openqa.selenium.By;

public class Plot extends RealEstate {

    public String FHouseNum;
    public String handleRCNumberInput;
    public String FAreaOverAll;
    public String purposes;
    public String markDescription;

    public Plot(String region, String settlement, String microdistrict, String street, String description, String imageUrl, String price, String phone, String email, String FHouseNum, String handleRCNumberInput, String FAreaOverAll, String purposes, String markDescription) {
        super(region, settlement, microdistrict, street, description, imageUrl, price, phone, email);
        this.FHouseNum = FHouseNum;
        this.handleRCNumberInput = handleRCNumberInput;
        this.FAreaOverAll = FAreaOverAll;
        this.purposes = purposes;
        this.markDescription = markDescription;
    }

    @Override
    public void fillRe() {
        driver.get("https://aruodas.lt/ideti-skelbima/?obj=11");
        super.fillRe();
        setFHouseNum();
        setHandleRCNumberInput();
        setFAreaOverAll();
        setPurposes();
        setMarkDescription();

    }

    public void setFHouseNum() {
        driver.findElement(By.name("FHouseNum")).sendKeys(this.FHouseNum);
    }

    public void setHandleRCNumberInput() {
        driver.findElement(By.name("RCNumber")).sendKeys(this.handleRCNumberInput);
    }

    public void setFAreaOverAll() {
        driver.findElement(By.name("FAreaOverAll")).sendKeys(this.FAreaOverAll);
    }

    public void setPurposes() {
        String[] purposes = this.purposes.split(",");
        for (int i = 0; i < purposes.length; i++) {
            switch (purposes[i]) {
                case "namu valda":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div/div[1]/label")).click();
                    break;
                case "Daugiabučių statyba":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div/div[2]/label")).click();
                    break;
                case "Žemės ūkio":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div/div[3]/label")).click();
                    break;
                case "Sklypas soduose":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div/div[4]/label")).click();
                    break;
                case "Miškų ūkio":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[16]/div/div[5]/label")).click();
                    break;
            }
        }
    }

    public void setMarkDescription() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/span/a")).click();
        String[] MarkDescription = this.markDescription.split(",");
        for (int i = 0; i < MarkDescription.length; i++) {
            switch (MarkDescription[i]) {
                case "Elektra":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[1]/label/span")).click();
                case "Dujos":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[2]/label/span")).click();
                case "Vanduo":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[3]/label/span")).click();
                case "Krastinis sklypas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[4]/label/span")).click();
                case "Greta misko":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[5]/label/span")).click();
                case "Be pastatu":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[6]/label/span")).click();
                case "Geodeziniai matavimai":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[7]/label/span")).click();
                case "Su pakrante":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[8]/label/span")).click();
                case "Asfaltuotas privaziavimas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[9]/label/span")).click();
                case "Domina keitimas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[23]/div/div/div/label/span")).click();
                case "Varzytynes/aukcionas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[24]/div/div/div/label/span")).click();
            }
        }
    }

}
