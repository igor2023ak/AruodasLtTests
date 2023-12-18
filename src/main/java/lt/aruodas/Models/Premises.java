package lt.aruodas.Models;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Premises extends RealEstate{

    public String FHouseNum;
    public String premisesNumber;
    public String handleRCNumberInput;
    public String plotArea;
    public String numFloor;
    public String yearBuilt;
    public String equipments;
    public String purposes2;

    public Premises(String region, String settlement, String microdistrict, String street, String description, String imageUrl, String price, String phone, String email, String FHouseNum, String premisesNumber, String handleRCNumberInput, String plotArea, String numFloor, String yearBuilt, String equipments, String purposes2) {
        super(region, settlement, microdistrict, street, description, imageUrl, price, phone, email);
        this.FHouseNum = FHouseNum;
        this.premisesNumber = premisesNumber;
        this.handleRCNumberInput = handleRCNumberInput;
        this.plotArea = plotArea;
        this.numFloor = numFloor;
        this.yearBuilt = yearBuilt;
        this.equipments = equipments;
        this.purposes2 = purposes2;
    }

    @Override
    public void fillRe() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=3");
        super.fillRe();
        setFHouseNum();
        setPremisesNumber();
        setHandleRCNumberInput();
        setPlotArea();
        setNumFloor();
        setYearBuilt();
        setEquipments();
        setPurposes2();
    }

    public void setFHouseNum() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/input")).sendKeys(this.FHouseNum);
    }

    public void setPremisesNumber() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[8]/span[1]/input")).sendKeys(this.premisesNumber);
    }

    public void setHandleRCNumberInput() {
        driver.findElement(By.name("RCNumber")).sendKeys(this.handleRCNumberInput);
    }

    public void setPlotArea() {
        driver.findElement(By.name("FAreaOverAll")).sendKeys(this.plotArea);
    }

    public void setNumFloor() {
        driver.findElement(By.xpath("//*[@id=\"fieldRow_FFloor\"]/div/span[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"fieldRow_FFloor\"]/div/span[2]/ul/li[5]/input")).sendKeys(this.numFloor);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        driver.findElement(By.xpath("//*[@id=\"fieldRow_FFloor\"]/div/label/span")).click();
    }

    public void setYearBuilt() {
        driver.findElement(By.name("FBuildYear")).sendKeys(this.yearBuilt);
    }

    public void setEquipments() {
        String[] equipments = this.equipments.split(",");
        for (int i = 0; i < equipments.length; i++) {
            switch (equipments[i]) {
                case "Irengtas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[1]/div[2]")).click();
                    break;
                case "Daline apdaila":                 //  //*[@id="newObjectForm"]/ul/li[18]/div/div[2]/div[2]
                     driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[2]/div[2]")).click();
                     break;
                case "Neirengtas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[3]/div[2]")).click();
                    break;
                case "Nebaigtas statyti":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[4]/div[2]")).click();
                    break;
                case "Pamatai":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[5]/div[2]")).click();
                    break;
                case "Kita":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[6]/div[2]")).click();
                    break;
            }
        }
    }

    public void setPurposes2() {
        String[] purposes2 = this.purposes2.split(",");
        for (int i = 0; i < purposes2.length; i++) {
            switch (purposes2[i]) {
                case "Administracine":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/div/div[1]/label")).click();
                    break;
                case "Prekybos":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/div/div[2]/label")).click();
                    break;
                case "Viesbuciu":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/div/div[3]/label")).click();
                    break;
                case "Paslaugu":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/div/div[4]/label")).click();
                    break;
                case "Sandeliavimo":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/div/div[5]/label")).click();
                    break;
                case "Gamybos ir pramones":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/div/div[6]/label")).click();
                    break;
                case "Maitinimo":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/div/div[7]/label")).click();
                    break;
                case "Kita":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[20]/div/div[8]/label")).click();
                    break;
            }
        }
    }
}
