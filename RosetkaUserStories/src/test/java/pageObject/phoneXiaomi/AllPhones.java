package pageObject.phoneXiaomi;

import driverHolder.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Stanislav on 23.02.2017.
 */
public class AllPhones extends DriverHolder {

    public AllPhones(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='filter5964']/div[1]/label/a")
    WebElement xioami;

    public XiaomiM3 selectXiaomiM3(){
        xioami.click();
        driver.findElement(By.xpath(".//*[@id='catalog_goods_block']//div[14]//*[@class='g-i-tile-i-title clearfix']/a"));
        return new XiaomiM3(driver);
    }




}
