package Testing1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by VARSA on 07-11-2015.
 */
public class TFLexamples {
    @Test
    public void testPlanAJourneyBetweenFelthamAndWaterloo() {
        //Crete Drvier
        WebDriver driver = new FirefoxDriver();
        //Open TFL Page
        driver.get("https://www.tfl.gov.uk");
        //Enter Station From
        //InputFrom
        WebElement stationFrom = driver.findElement(By.id("InputFrom"));
        stationFrom.sendKeys("Feltham Rail Station");

        //Enter Statopn To
        WebElement stationTo = driver.findElement(By.id("InputTo"));
        stationTo.sendKeys("London Waterloo East Rail Station");
        //Click Plan A jOURNEY Button
        WebElement planAJourneyButton = driver.findElement(By.className("plan-journey-button"));
        planAJourneyButton.click();
        //Check Results Display
        System.out.printf("print the results Page title"+driver.getTitle());
        assertEquals("Journey results - Transport for London",driver.getTitle());
    }
}
