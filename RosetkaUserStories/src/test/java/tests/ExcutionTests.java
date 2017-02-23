package tests;

import homePageRozetka.HomePageRozetka;
import notebooksHP.GameNotebook;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import phoneXiaomi.AllPhones;
import phoneXiaomi.XiaomiM3;

/**
 * Created by Stanislav on 22.02.2017.
 */
public class ExcutionTests{

    public WebDriver driver;

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
        xiaomiM3.getPrice();
        xiaomiM3.goCart();











    }

    @After

    public void tearDown(){
        driver.quit();
    }

}
