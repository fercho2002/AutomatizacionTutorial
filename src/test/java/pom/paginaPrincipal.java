package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class paginaPrincipal extends BasePage{

    public paginaPrincipal(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "menu-item-2008")
    private WebElement botondecomics;
    private String titulo = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";



    public boolean paginaPrincipalIsDisplayed(){
        return this.getTitle().equals(titulo);
    }
    public void clikEnElBotonComics(){
        this.clik(botondecomics);
    }
}
