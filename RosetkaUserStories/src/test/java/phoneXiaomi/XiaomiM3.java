package phoneXiaomi;

import driverHolder.DriverHolder;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Stanislav on 23.02.2017.
 */
public class XiaomiM3 extends DriverHolder {

    public XiaomiM3(WebDriver driver){
        super(driver);
    }

    public String getPrice(){
       String priceOfXioami = driver.findElement(By.xpath(".//*[@class='detail-price-uah']")).getText();
        return priceOfXioami;
    }

    public String goCart(){
        driver.findElement(By.xpath(".//*[@class='detail-credit-centering']//button)")).click();
        String priceInCart = driver.findElement(By.xpath(".//*[@class='cart-uah']")).getText();
        return priceInCart ;
    }

    public void assertPrice(){
        Assert.assertTrue(goCart().contains(getPrice()));
    }
}

