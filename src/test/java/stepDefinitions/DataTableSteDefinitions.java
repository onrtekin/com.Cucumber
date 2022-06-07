package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DatatablesPage;

public class DataTableSteDefinitions {
    DatatablesPage datatable=new DatatablesPage();
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
      datatable.newButonunaBasar.click();

    }
    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String firstname) {
        datatable.firstName.sendKeys(firstname);
    }
    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String lastname) {
        datatable.lastName.sendKeys(lastname);
    }
    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String position) {
        datatable.position.sendKeys(position);
    }
    @Then("ofis bolumune {string} yazar")
    public void ofis_bolumune_yazar(String ofis) {
    datatable.office.sendKeys(ofis);
    }
    @Then("extension bolumune {string} yazar")
    public void extension_bolumune_yazar(String extension) {
        datatable.extn.sendKeys(extension);
    }
    @Then("startDate bolumune {string} yazar")
    public void start_date_bolumune_yazar(String startDate) {
        datatable.startDate.sendKeys(startDate);

    }
    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {
     datatable.salary.sendKeys(salary);

    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
      datatable.create.click();

    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        datatable.search.sendKeys(firstname);



    }


    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstname) {

        Assert.assertTrue(datatable.aramaSonucIlkElement.getText().contains(firstname));

    }
}
