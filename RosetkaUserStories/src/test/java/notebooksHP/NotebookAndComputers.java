package notebooksHP;

import driverHolder.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Stanislav on 22.02.2017.
 */
public class NotebookAndComputers extends DriverHolder{

    public NotebookAndComputers(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='p-auto-block p-auto-block-1'][1]/div/div[3]/div[1]//h4")
    public WebElement gameNotebook;

    public GameNotebook goGameNoteBook(){
        gameNotebook.click();
        return new GameNotebook(driver);
    }
}
