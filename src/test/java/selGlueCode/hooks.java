package selGlueCode;

import BrowserManager.DriverManager;
import BrowserManager.DriverType;
import BrowserManager.driverManagerFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks {

    private static WebDriver driver;
    private static  int contador = 0;
    private DriverManager driverManager;



    @Before
    public void setUp(){
        contador++;
        System.out.println("se va a ejecutar el escenario : "+contador);
        /*
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver(); */
        driverManager = driverManagerFactory.getManager(DriverType.EDGE);
        driver = driverManager.getDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        System.out.println("se termino de ejecutar el escenario : "+contador);
        driverManager.quitDriver();
    }
    /*
    public static ChromeDriver getDriver(){
        return driver;
    }*/
    public static WebDriver getDriver() {
        return driver;
    }


}
