package lt.aruodas.Models;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import javax.crypto.KEM;

public class ApartSold extends RealEstate{
    public String apartHouseNum;
    public String apartFlatNum;
    public String apartRcNum;
    public String apartArea;
    public String apartRoomQuantity;
    public String apartFloorLow;
    public String apartFloorHigh;
    public String apartYear;
    public String apartRenovatedYear;
    public String apartHouseType;
    public String apartEquipment;
    public String apartHeating;
    public String apartApartmentIntendance;
    public String apartDescription;
    public String apartAddPremises;
    public String apartAddEquipment;
    public String apartSecurity;
    public String apartEnergyClass;


    public ApartSold(String region, String settlement, String microdistrict, String street, String description, String imageUrl, String price, String phone, String email, String apartHouseNum, String apartFlatNum, String apartRcNum, String apartArea, String apartRoomQuantity, String apartFloorLow, String apartFloorHigh, String apartYear, String apartRenovatedYear, String apartHouseType, String apartEquipment, String apartHeating, String apartApartmentIntendance, String apartDescription, String apartAddPremises, String apartAddEquipment, String apartSecurity, String apartEnergyClass) {
        super(region, settlement, microdistrict, street, description, imageUrl, price, phone, email);
        this.apartHouseNum = apartHouseNum;
        this.apartFlatNum = apartFlatNum;
        this.apartRcNum = apartRcNum;
        this.apartArea = apartArea;
        this.apartRoomQuantity = apartRoomQuantity;
        this.apartFloorLow = apartFloorLow;
        this.apartFloorHigh = apartFloorHigh;
        this.apartYear = apartYear;
        this.apartRenovatedYear = apartRenovatedYear;
        this.apartHouseType = apartHouseType;
        this.apartEquipment = apartEquipment;
        this.apartHeating = apartHeating;
        this.apartApartmentIntendance = apartApartmentIntendance;
        this.apartDescription = apartDescription;
        this.apartAddPremises = apartAddPremises;
        this.apartAddEquipment = apartAddEquipment;
        this.apartSecurity = apartSecurity;
        this.apartEnergyClass = apartEnergyClass;
    }

    @Override
    public void fillRe() {
        driver.get("https://en.aruodas.lt/ideti-skelbima/?obj=1");
        super.fillRe();
        setApartHouseNum();
        setApartFlatNum();
        setApartRcNum();
        setApartArea();
        setApartRoomQuantity();
        setApartFloorLow();
        setApartFloorHigh();
        setApartYear();
        setApartRenovatedYear();
        setApartHouseType();
        setApartEquipment();
        setApartHeating();
//        setApartApartmentIntendance();
        setApartDescription();
        setApartAddPremises();
        setApartAddEquipment();
        setApartSecurity();
        setApartEnergyClass();

    }

    public void setApartHouseNum() {
//        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/div/div/label/span")).click();
        driver.findElement(By.name("FHouseNum")).sendKeys(this.apartHouseNum);
    }

    public void setApartFlatNum() {
//        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[8]/div/div/label")).click();
        driver.findElement(By.name("FApartNum")).sendKeys(this.apartFlatNum);
        driver.findElement(By.xpath("//*[@id=\"chooseMapLocation\"]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        driver.findElement(By.xpath("//*[@id=\"fancybox-close\"]")).click();
    }

    public void setApartRcNum() {
//        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[12]/div[2]/div/label/span")).click();
        driver.findElement(By.name("RCNumber")).sendKeys(this.apartRcNum);
    }

    public void setApartArea() {
        driver.findElement(By.name("FAreaOverAll")).sendKeys(this.apartArea);
    }

    public void setApartRoomQuantity() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[15]/div/span/input")).sendKeys(this.apartRoomQuantity);
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[15]/label")).click();
    }

    public void setApartFloorLow() {
        driver.findElement(By.xpath("//*[@id=\"fieldRow_FFloor\"]/div[1]/span[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"fieldRow_FFloor\"]/div[1]/span[2]/ul/li[5]/input")).sendKeys(this.apartFloorLow);
        driver.findElement(By.xpath("//*[@id=\"fieldRow_FFloor\"]/div[1]/label/span")).click();
    }
    public void setApartFloorHigh() {
        driver.findElement(By.xpath("//*[@id=\"fieldRow_FHouseHeight\"]/span[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"fieldRow_FHouseHeight\"]/span[1]/ul/li[10]/input")).sendKeys(this.apartFloorHigh);
        driver.findElement(By.xpath("//*[@id=\"fieldRow_FFloor\"]/div[1]/label/span")).click();
    }

    public void setApartYear() {
        driver.findElement(By.name("FBuildYear")).sendKeys(this.apartYear);
    }
    public void setApartRenovatedYear() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/div[2]/div/div/label/span")).click();
        driver.findElement(By.name("FRenovatedYear")).sendKeys(this.apartRenovatedYear);
    }

    public void setApartHouseType() {
        String[] ApartHouseType = this.apartHouseType.split(",");
        for (int i = 0; i < ApartHouseType.length; i++) {
            switch (ApartHouseType[i]) {
                case "Murinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[1]/div[2]")).click();
                    break;
                case "Blokinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[2]/div[2]")).click();
                    break;
                case "Monolitinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[3]/div[2]")).click();
                    break;
                case "Medinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[4]/div[2]")).click();
                    break;
                case "Karkasinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[5]/div[2]")).click();
                    break;
                case "Rastinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[6]/div[2]")).click();
                    break;
                case "Skydinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[7]/div[2]")).click();
                    break;
                case "Kita":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[18]/div/div[8]/div[2]")).click();
                    break;
            }
        }
    }

    public void setApartEquipment() {
        String[] ApartEquipment = this.apartEquipment.split(",");
        for (int i = 0; i < ApartEquipment.length; i++) {
            switch (ApartEquipment[i]) {
                case "Irengtas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[1]/div[2]")).click();
                    break;
                case "Daline Apdaila":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[2]/div[2]")).click();
                    break;
                case "Neirengtas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[3]/div[2]")).click();
                    break;
                case "Nebaigtas Statyti":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[4]/div[2]")).click();
                    break;
                case "Pamatai":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[5]/div[2]")).click();
                    break;
                case "Kita":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[6]/div[2]")).click();
                    break;
            }
        }
    }

    public void setApartHeating() {
        String[] ApartHeating = this.apartHeating.split(",");
        for (int i = 0; i < ApartHeating.length; i++) {
            switch (ApartHeating[i]) {
                case "Centrinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[1]/label/span")).click();
                    break;
                case "Elektra":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[2]/label/span")).click();
                    break;
                case "Skystu kuru":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[3]/label/span")).click();
                    break;
                case "Centrinis kolektorinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[4]/label/span")).click();
                    break;
                case "Geoterminis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[5]/label/span")).click();
                    break;
                case "Aeroterminis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[6]/label/span")).click();
                    break;
                case "Dujinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[7]/label/span")).click();
                    break;
                case "Kietu kuru":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[8]/label/span")).click();
                    break;
                case "Saules energija":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[9]/label/span")).click();
                    break;
                case "Kita":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[10]/label/span")).click();
                    break;
            }
        }
    }

    public void setApartApartmentIntendance() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div[2]/div[2]")).click();
        String[] ApartApartmentIntendance = this.apartApartmentIntendance.split(",");
        for (int i = 0; i < ApartApartmentIntendance.length; i++) {
            switch (ApartApartmentIntendance[i]) {
                case "Viesbuciu":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[23]/div/div[1]/div[2]")).click();
                    break;
                case "Poilsio":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[23]/div/div[2]/div[2]")).click();
                    break;
            }
        }
    }
    public void setApartDescription() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[25]/span")).click();
        String[] ApartDescription = this.apartDescription.split(",");
        for (int i = 0; i < ApartDescription.length; i++) {
            switch (ApartDescription[i]) {
                case "Atskiras iejimas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[27]/div/div[1]/label/span")).click();
                    break;
                case "Aukstos lubos":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[27]/div/div[2]/label/span")).click();
                    break;
                case "Butas palepeje":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[27]/div/div[3]/label/span")).click();
                    break;
                case "Butas per kelis aukstus":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[27]/div/div[4]/label/span")).click();
                    break;
                case "Tualetas ir vonia atskirai":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[27]/div/div[5]/label/span")).click();
                    break;
                case "Nauja kanalizacija":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[27]/div/div[6]/label/span")).click();
                    break;
                case "Nauja elektros instaliacija":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[27]/div/div[7]/label/span")).click();
                    break;
                case "Uzdaras kiemas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[27]/div/div[8]/label/span")).click();
                    break;
                case "Internetas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[27]/div/div[9]/label/span")).click();
                    break;
                case "Kabeline televizija":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[27]/div/div[10]/label/span")).click();
                    break;
                case "Virtuve sujungta su kambariu":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[27]/div/div[11]/label/span")).click();
                    break;
                case "Buto dalis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[27]/div/div[12]/label/span")).click();
                    break;
            }
        }
    }

    public void setApartAddPremises() {
        String[] ApartAddPremises = this.apartAddPremises.split(",");
        for (int i = 0; i < ApartAddPremises.length; i++) {
            switch (ApartAddPremises[i]) {
                case "Sandeliukas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[29]/div/div[1]/label/span")).click();
                    break;
                case "Balkonas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[29]/div/div[2]/label/span")).click();
                    break;
                case "Terasa":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[29]/div/div[3]/label/span")).click();
                    break;
                case "Rusys":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[29]/div/div[4]/label/span")).click();
                    break;
                case "Pirtis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[29]/div/div[5]/label/span")).click();
                    break;
                case "Vieta automobiliui":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[29]/div/div[6]/label/span")).click();
                    break;
                case "Yra palepe":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[29]/div/div[7]/label/span")).click();
                    break;
                case "Drabuzine":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[29]/div/div[8]/label/span")).click();
                    break;
            }
        }
    }

    public void setApartAddEquipment() {
        String[] ApartAddEquipment = this.apartAddEquipment.split(",");
        for (int i = 0; i < ApartAddEquipment.length; i++) {
            switch (ApartAddEquipment[i]) {
                case "Kondicionerius":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[31]/div/div[1]/label/span")).click();
                    break;
                case "Skalbimo masina":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[31]/div/div[2]/label/span")).click();
                    break;
                case "Su baldais":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[31]/div/div[3]/label/span")).click();
                    break;
                case "Saldytuvas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[31]/div/div[4]/label/span")).click();
                    break;
                case "Sildomos grindis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[31]/div/div[5]/label/span")).click();
                    break;
                case "Virtuves komplektas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[31]/div/div[6]/label/span")).click();
                    break;
                case "Virykle":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[31]/div/div[7]/label/span")).click();
                    break;
                case "Zidinys":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[31]/div/div[8]/label/span")).click();
                    break;
                case "Plastikiniai vamzdziai":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[31]/div/div[9]/label/span")).click();
                    break;
                case "Indaplove":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[31]/div/div[10]/label/span")).click();
                    break;
                case "Duso kabina":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[31]/div/div[11]/label/span")).click();
                    break;
                case "Vonia":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[31]/div/div[12]/label/span")).click();
                    break;
                case "Rekuperacine sistema":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[31]/div/div[13]/label/span")).click();
                    break;
            }
        }
    }

    public void setApartSecurity() {
        String[] ApartSecurity = this.apartSecurity.split(",");
        for (int i = 0; i < ApartSecurity.length; i++) {
            switch (ApartSecurity[i]) {
                case "Sarvuotos durys":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[33]/div/div[1]/label/span")).click();
                    break;
                case "Signalizacija":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[33]/div/div[2]/label/span")).click();
                    break;
                case "Kodine laiptines spyna":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[33]/div/div[3]/label/span")).click();
                    break;
                case "Vaizdo kameros":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[33]/div/div[4]/label/span")).click();
                    break;
                case "Budintis sargas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[33]/div/div[5]/label/span")).click();
                    break;
            }
        }
    }

    public void setApartEnergyClass() {
        String[] ApartEnergyClass = this.apartEnergyClass.split(",");
        for (int i = 0; i < ApartEnergyClass.length; i++) {
            switch (ApartEnergyClass[i]) {
                case "A++":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[35]/div/div[1]/div[2]")).click();
                    break;
                case "A+":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[35]/div/div[2]/div[2]")).click();
                    break;
                case "A":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[35]/div/div[3]/div[2]")).click();
                    break;
                case "B":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[35]/div/div[4]/div[2]")).click();
                    break;
                case "C":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[35]/div/div[5]/div[2]")).click();
                    break;
                case "D":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[35]/div/div[6]/div[2]")).click();
                    break;
                case "E":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[35]/div/div[7]/div[2]")).click();
                    break;
                case "F":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[35]/div/div[8]/div[2]")).click();
                    break;
                case "G":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[35]/div/div[9]/div[2]")).click();
                    break;
                case "Domina keitimas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[36]/div/div/div/label/span")).click();
                    break;
                case "Varzytynes/aukcionas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[37]/div/div/div/label/span")).click();
                    break;
            }
        }
    }

}
