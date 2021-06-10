package project;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class config {
    public WebDriver driver;
    protected String driverPath= "driver\\chromedriver.exe";
    protected String pag1to50 = "http://zzzscore.com/1to50/en/";

    public config(){
        webDriver();
        abreNavegador();
    }

    public WebDriver webDriver() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        return driver;
    }

    public void abreNavegador(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(pag1to50);
        espera(1);
    }

    public void espera(int tiempo) {
        int timeInSecs=tiempo*1000;
        try {
            Thread.sleep(timeInSecs); }
        catch (InterruptedException e) {
            e.printStackTrace(); }
    }
}
