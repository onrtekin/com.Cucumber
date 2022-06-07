package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HMCStepDefinitions {
    HMCPage hmcpage=new HMCPage();
    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
       hmcpage.loginButonu.click();

    }
    @Then("gecerli username girer")
    public void gecerli_username_girer() {
       hmcpage.usernameKutusu.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        hmcpage.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCValidPassword"));

    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
      hmcpage.loginButonu2.click();

    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
      Assert.assertTrue(hmcpage.hotelManagement.isDisplayed());

    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmcpage.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));

    }

    @And("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
        Assert.assertTrue(hmcpage.loginButonu2.isDisplayed());

    }

    @And("gecersiz  username girer")
    public void gecersizUsernameGirer() {
        hmcpage.usernameKutusu.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
    }
}
