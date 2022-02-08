package selGlueCode;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test extends testbase{

    //private ChromeDriver driver = hooks.getDriver();


    @Given("^el usuario se encuentra en la pagina principal de imalitteltester$")
    public void el_usuario_se_encuentra_en_la_pagina_principal_de_imalitteltester() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(paginaprincipal.paginaPrincipalIsDisplayed());

    }

    @When("^hace clik sobre el boto the litle tester comics$")
    public void hace_clik_sobre_el_boto_the_litle_tester_comics() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        paginaprincipal.clikEnElBotonComics();

    }

    @Then("^se debe redirigir a la pantalla comics$")
    public void se_debe_redirigir_a_la_pantalla_comics() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue("no se redirecciono correctamente al la pagina de comics ",comicsPage.estaElTituloComics());

    }
}
