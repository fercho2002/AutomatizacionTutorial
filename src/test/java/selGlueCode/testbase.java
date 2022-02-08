package selGlueCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.paginaComics;
import pom.paginaPrincipal;

public class testbase {

    protected WebDriver driver = hooks.getDriver();
    protected paginaPrincipal paginaprincipal = PageFactory.initElements(driver,paginaPrincipal.class);
    protected paginaComics comicsPage = PageFactory.initElements(driver,paginaComics.class);



}
