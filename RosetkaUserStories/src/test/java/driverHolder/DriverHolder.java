package driverHolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Stanislav on 22.02.2017.
 */
public class DriverHolder {

    public WebDriver driver;

    public DriverHolder(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
