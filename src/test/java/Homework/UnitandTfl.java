package Homework;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
        import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.By;
  import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;




/**
 * Created by VARSA on 13-11-2015.
 */
public class UnitandTfl {
    @Test
    public void testTflSample()
    {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://tfl.gov.uk/fares-and-payments/fares/single-fare-finder");
        WebElement firstBox=driver.findElement(By.id("From"));
firstBox.sendKeys("Richmond Underground Station");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
WebElement autoOptions= driver.findElement(By.cssSelector(".//*[@id='sff-form']/div/div[1]/div[1]/span/span/div/span/div[1]/span"));
        autoOptions.click();


//Select dropdown=new Select(driver.findElement(By.xpath("id('From')")));
  //    dropdown.selectByVisibleText("Richmond Underground Station (Zone 4)");
       // Select listbox= new Select(driver.findElement(By.xpath("id('From')")));
        //listbox.selectByValue("Richmond Underground Station (Zone 4)");
      //  WebElement option=driver.findElement (By.xpath("id('sff-form')/div/div[1]/div[1]/span/span/div/span/div[1]/span"));
       // option.click();
        WebElement secondBox=driver.findElement(By.name("To"));
        secondBox.sendKeys("London Victoria Rail Station");
driver.findElement(By.className("primary-button")).click();

    }
}
/*public class pass{
    @Test
public static void main(String[] args) {
        String passname = new String;
        passname = "Testing";
        assertEquals(String.Length >= 5);
        if (passname =>=5){

        }
        System.out.println("Passed");
        else{

        }
        System.out.println("Failed");
    }}
}
}
@Test
*/

