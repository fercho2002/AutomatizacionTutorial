package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class paginaComics extends BasePage{

    public paginaComics(WebDriver driver){
        super(driver);
    }

    @FindBy(className = "page-title")

    private WebElement localizadorComics ;

    private String titulocomics = "Category: comics";

    public boolean estaElTituloComics(){
        return this.isDisplayed(localizadorComics) && this.getText(localizadorComics).equals(titulocomics);
    }
}
