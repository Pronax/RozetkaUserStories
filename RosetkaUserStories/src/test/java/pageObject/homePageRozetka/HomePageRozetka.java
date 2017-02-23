package pageObject.homePageRozetka;

import driverHolder.DriverHolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.notebooksHP.NotebookAndComputers;
import pageObject.phoneXiaomi.GoPhonesAndElectronics;

/**
 * Created by Stanislav on 22.02.2017.
 */
public class HomePageRozetka extends DriverHolder {

    public HomePageRozetka(WebDriver driver) {
        super(driver);

    }

    public HomePageRozetka goMainPage() {
        driver.get("http://rozetka.com.ua/");
        return new HomePageRozetka(driver);
    }

    @FindBy(xpath =".//*[@id='2416']/a")
    WebElement notebookPage;

    public NotebookAndComputers goNotebookAndComputers() {
        notebookPage.click();
        return new NotebookAndComputers(driver);
    }


    public GoPhonesAndElectronics goPhonesAndElectronics(){
        driver.findElement(By.xpath(".//*[@id='3361']/a"));
        return new GoPhonesAndElectronics(driver);
    }



}
