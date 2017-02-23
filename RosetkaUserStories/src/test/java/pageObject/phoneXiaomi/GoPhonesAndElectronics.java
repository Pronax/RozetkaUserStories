package pageObject.phoneXiaomi;

import driverHolder.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Stanislav on 23.02.2017.
 */
public class GoPhonesAndElectronics extends DriverHolder{

    public GoPhonesAndElectronics(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = ".//*[@class='p-auto-block p-auto-block-1'][1]//*[@class='pab-row pab-row-tierce'][1]/div[1]//h3")
    WebElement BrandOfPhones;

    public BrandOfPhones goBrandOfPhones(){
        BrandOfPhones.click();
        return new BrandOfPhones(driver);
    }
}
