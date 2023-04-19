package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {
    GuruPage guruPage = new GuruPage();

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void istenen_baslik_sutunundaki_tum_degerleri_yazdirir(String istenenSutun) {

        List<WebElement> tabloBaslikListesi = guruPage.baslikListesi;
        int istenenBaslikIndex = -3;

        for (int i = 0; i < tabloBaslikListesi.size(); i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)) {
                istenenBaslikIndex = i+1;
                break;

            }
        }

        if(istenenBaslikIndex!=-3){
           List<WebElement>istenenSutundakiElementler= Driver.getDriver()
                   .findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndex+"]"));
            for (WebElement each:istenenSutundakiElementler) {
                System.out.println(each.getText());
            }
        }else{
            System.out.println("istenen baslik bulunamadi");
        }
    }

}
