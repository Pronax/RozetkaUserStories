package notebooksHP;

import driverHolder.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Stanislav on 22.02.2017.
 */
public class GameNotebook extends DriverHolder {

    public GameNotebook(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='filter5']//a")
    WebElement hpPage;

    public GameNotebook selectHP(){
        hpPage.click();
        return new GameNotebook(driver);
    }



    public GameNotebook selectPriceBorder(){
        WebElement slider = driver.findElement(By.xpath(".//*[@id='trackbarprice']//td[@class='rb']//img"));
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(slider,20,0).build();
        action.perform();
        return new GameNotebook(driver);
    }



}
