package lt.aruodas.Models;

import org.openqa.selenium.By;

public class FlatSold extends RealEstate {

    public String plotFlat;
    public String numFloor;
    public String plotArea;
    public String yearBuilt;
    public String BuildingTypes;
    public String houseTypes;
    public String equipments;
    public String HeatingTypes;

    public FlatSold(String region, String settlement, String microdistrict, String street, String description, String imageUrl, String price, String phone, String email, String plotFlat, String numFloor, String plotArea, String yearBuilt, String buildingTypes, String houseTypes, String equipments, String heatingTypes) {
        super(region, settlement, microdistrict, street, description, imageUrl, price, phone, email);
        this.plotFlat = plotFlat;
        this.numFloor = numFloor;
        this.plotArea = plotArea;
        this.yearBuilt = yearBuilt;
        this.BuildingTypes = buildingTypes;
        this.houseTypes = houseTypes;
        this.equipments = equipments;
        this.HeatingTypes = heatingTypes;
    }

    @Override
    public void fillRe() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=2");
        super.fillRe();
        setPlotArea();
        setNumFloor();
        setPlotArea();
        setYearBuilt();
        setBuildingTypes();
        setHouseTypes();
        setEquipment();
        setHeatingTypes();
    }

    private void setPlotFlat() {
        driver.findElement(By.name("FAreaOverAll")).sendKeys(this.plotFlat);
    }

    private void setNumFloor() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[14]/div/span/input")).sendKeys(this.numFloor);
    }

    private void setPlotArea() {
        driver.findElement(By.name("FAreaLot")).sendKeys(this.plotArea);
    }

    private void setYearBuilt() {
        driver.findElement(By.name("FBuildYear")).sendKeys(this.yearBuilt);
    }

    private void setBuildingTypes() {
        String[] BuildingTypes = this.BuildingTypes.split(",");
        for (int i = 0; i < BuildingTypes.length; i++) {
            switch (BuildingTypes[i]) {
                case "Namas gyvenamasis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/div/div[1]/div[2]")).click();
                    break;
                case "Namo dalis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/div/div[2]/div[2]")).click();
                    break;
                case "Sodo namas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/div/div[3]/div[2]")).click();
                    break;
                case "Sublokotas namas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/div/div[4]/div[2]")).click();
                    break;
                case "Sodyba":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/div/div[5]/div[2]")).click();
                    break;
                case "Kita":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/div/div[6]/div[2]")).click();
                    break;
            }
        }
    }

    private void setHouseTypes() {
        String[] houseTypes = this.houseTypes.split(",");
        for (int i = 0; i < houseTypes.length; i++) {
            switch (houseTypes[i]) {
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

    private void setEquipment() {
        String[] equipments = this.equipments.split(",");
        for (int i = 0; i < equipments.length; i++) {
            switch (equipments[i]){
                case "Irengtas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[1]/div[2]")).click();
                    break;
                case "Daline apdaila":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[2]/div[2]")).click();
                    break;
                case "Neirengtas":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[19]/div/div[3]/div[2]")).click();
                    break;
                case "Nebaigtas statyti":
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
    private void setHeatingTypes() {
        String[] HeatingTypes = this.HeatingTypes.split(",");
        for (int i = 0; i < HeatingTypes.length; i++) {
            switch (HeatingTypes[i]){
                case "Centrinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[1]/label")).click();
                    break;
                case "Elektra":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[2]/label")).click();
                    break;
                case "Skystu kuru":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[3]/label")).click();
                    break;
                case "Centrinis kolektorinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[4]/label")).click();
                    break;
                case "Geoterminis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[5]/label")).click();
                    break;
                case "Aeroterminis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[6]/label")).click();
                    break;
                case "Dujinis":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[7]/label")).click();
                    break;
                case "Kietu kuru":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[8]/label")).click();
                    break;
                case "Saules energija":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[9]/label")).click();
                    break;
                case "Kita":
                    driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[21]/div/div[10]/label")).click();
                    break;
            }
        }
    }
}
