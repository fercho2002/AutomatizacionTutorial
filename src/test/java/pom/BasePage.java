package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driverr){
        this.driver = driverr;
    }

    public void clik(WebElement elemento){
        try{
            elemento.click();
        }catch (Exception e){
            System.out.println("error al hacer clik sobre el elemento "+e+"con el elemento :"+elemento);
        }


    }


    public boolean isDisplayed(WebElement elemento){
        try{
            elemento.isDisplayed() ;
            return true;
        }catch (Exception e){
            System.out.println("no se pudo encontrar el elemento "+elemento);
            return false;
        }


    }


    public String getText(WebElement elemento){
        String texto = null;
        try{
            texto = elemento.getText() ;
        }catch (Exception e){
            System.out.println("error al capturar el texto de el elemento  "+elemento);
        }
        return texto;


    }

    public String getTitle(){
        String titulo = null;
        try{
            titulo = driver.getTitle() ;
        }catch (Exception e){
            System.out.println("error al capturar el titulo");
        }
        return titulo;


    }
}
