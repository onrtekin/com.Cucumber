package stepDefinitions;

import io.cucumber.java.en.*;

import org.junit.Assert;

import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon sayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);


    }
    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        String arananKelime="Nutella";
        String actualAramaSonuc=amazonPage.aramaSonuc.getText();
        Assert.assertTrue(actualAramaSonuc.contains(arananKelime));

    }

    @Then("kullanici Java icin arama yapar")
    public void kullaniciJavaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Java"+ Keys.ENTER);
    }



    @And("sonuclarin Java icerdigini test eder")
    public void sonuclarinJavaIcerdiginiTestEder() {
        String arananKelime="Java";
        String actualAramaSonuc=amazonPage.aramaSonuc.getText();
        Assert.assertTrue(actualAramaSonuc.contains(arananKelime));


    }


    @Then("kullanici Laptop icin arama yapar")
    public void kullaniciLaptopIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Laptop"+ Keys.ENTER);

    }

    @And("sonuclarin Laptop icerdigini test eder")
    public void sonuclarinLaptopIcerdiginiTestEder() {
        String arananKelime="Laptop";
        String actualAramaSonuc=amazonPage.aramaSonuc.getText();
        Assert.assertTrue(actualAramaSonuc.contains(arananKelime));

    }
    @Given("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime+ Keys.ENTER);


    }
    @Given("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String istenenKelime) {
        String arananKelime=istenenKelime;
        String actualAramaSonuc=amazonPage.aramaSonuc.getText();
        Assert.assertTrue(actualAramaSonuc.contains(arananKelime));


    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @Given("kullanici {string} sayfasinda")
    public void kullaniciSayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));


    }

    @And("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
