package Web;


import Helper.Misc;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class MyDriver {

  private static org.openqa.selenium.WebDriver driver;


    public static void launchUrlOnNewWindow (String url) {

        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");

        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


    public static void quitWindow(){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
