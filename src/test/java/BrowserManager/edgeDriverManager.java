package BrowserManager;

import org.openqa.selenium.edge.EdgeDriver;

public class edgeDriverManager extends DriverManager {

    @Override
    public void createDriver(){
        System.setProperty("webdriver.edge.driver","./src/test/resources/edgedriver/msedgedriver.exe");
        driver = new EdgeDriver();
    }
}
