package phoneXiaomi;

import driverHolder.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Stanislav on 23.02.2017.
 */
public class BrandOfPhones extends DriverHolder {

    public BrandOfPhones(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = ".//*[@class='pab-group-href']//a")
    WebElement allPhones;

    public AllPhones goAllPhones(){
        allPhones.click();
        return new AllPhones(driver);
    }

}
