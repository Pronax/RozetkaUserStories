package tests;


import pageObject.homePageRozetka.HomePageRozetka;
import pageObject.notebooksHP.GameNotebook;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObject.phoneXiaomi.XiaomiM3;

import java.util.concurrent.TimeUnit;

/**
 * Created by Stanislav on 22.02.2017.
 */
public class ExcutionTests{

    private WebDriver driver;

    @Before
    public void webDriver() {
        System.setProperty("webdriver.gecko.driver", "C://Users/Stanislav/Desktop/практика Регулярка/geckodriver-v0.11.1-win64/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void notebooksHP(){

        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        GameNotebook gameNotebook = homePageRozetka
                .goMainPage()
                .goNotebookAndComputers()
                .goGameNoteBook()
                .selectHP();
        gameNotebook.selectPriceBorder();



    }

    @Test
    public void phoneXiaomi(){
        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        XiaomiM3 xiaomiM3 = homePageRozetka
                .goMainPage()
                .goPhonesAndElectronics()
                .goBrandOfPhones()
                .goAllPhones()
                .selectXiaomiM3();
        Assert.assertTrue(xiaomiM3.goCart().equals(xiaomiM3.getPrice()));











    }

    @After

    public void tearDown(){
        driver.quit();
    }

}
