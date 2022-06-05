package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BlueRentalCarsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentAlCarsStepDefinitions {
    BlueRentalCarsPage blueRentalCarsPage=new BlueRentalCarsPage();

    @Given("kullanici Bluerentalcars sayfasinda")
    public void kullanici_bluerentalcars_sayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

    }

    @Then("kullanici ilk login butonuna basar")
    public void kullanici_ilk_login_butonuna_basar() {
        blueRentalCarsPage.ilkLoginButonu.click();

    }

    @Then("kullanici email adresini girer")
    public void kullanici_email_adresini_girer() {
        blueRentalCarsPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));

    }

    @Then("kullanici sifresini girer")
    public void kullanici_sifresini_girer() {
        blueRentalCarsPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));

    }

    @Then("kullanici ikinci login butonuna basar")
    public void kullanici_ikinci_login_butonuna_basar() {
        blueRentalCarsPage.ikinciLoginButonu.click();


    }

    @Then("login oldugunu test eder")
    public void login_oldugunu_test_eder() {
        Assert.assertTrue(blueRentalCarsPage.kullaniciProfilIsmi.isDisplayed());


    }



    @And("kullanici wrong password girer")
    public void kullaniciWrongPasswordGirer() {
        blueRentalCarsPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));

    }

    @And("login olamadigini test eder")
    public void loginOlamadiginiTestEder() {
        Assert.assertTrue(blueRentalCarsPage.ilkLoginButonu.isDisplayed());

    }


    @And("kullanici wrong email adresi girer")
    public void kullaniciWrongEmailAdresiGirer() {
        blueRentalCarsPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcWrongEmail"));

    }
    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();


    }

}
