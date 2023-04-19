package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
   cucumber da stepdefinitions page i icerisinde @before @after gibi bir notasyon varsa
     extends test base dememize gerek kalmadan her seneryodan once bu methodlar calisir

     cucumberda @before @after kullanma ihtiyacimiz olursa
     bunu stepdefinitions package i altinda olusturacagimiz hooks classina koyariz

     test sonucunu kontrol edip failed olan lar icin screenshoot almasi icin @After methodu kullaniriz

     */
    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
      //  Driver.closeDriver();
    }
}
