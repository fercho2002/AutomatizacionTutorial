package BrowserManager;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriverManager extends DriverManager {

    @Override
    public void createDriver(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }

}
