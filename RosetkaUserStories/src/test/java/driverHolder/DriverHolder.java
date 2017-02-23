package driverHolder;

import org.openqa.selenium.WebDriver;


/**
 * Created by Stanislav on 22.02.2017.
 */
public class DriverHolder {

    public WebDriver driver;

    public DriverHolder(WebDriver driver){
        this.driver = driver;
    }
}
