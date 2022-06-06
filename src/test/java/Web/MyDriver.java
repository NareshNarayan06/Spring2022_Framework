package Web;


import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyDriver {

  private static org.openqa.selenium.WebDriver driver;


    public static void launchUrlOnNewWindow (String url) {

        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");

        driver= new ChromeDriver();

        driver.get(url);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @After
    public static void quitWindow(){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
