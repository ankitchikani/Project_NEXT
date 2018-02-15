package pageobject;

import mydrivers.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ProductImagePage extends DriverBase {

    public void SelectProductfromImage(String ImageProduct){
        List<WebElement> Products= driver.findElements(By.cssSelector("#Mapg632322>area"));
        for (WebElement element: Products){
            if (element.getAttribute("alt").startsWith(ImageProduct)){
                //new Actions(driver).moveToElement(element).contextClick().build().perform();
                element.sendKeys(Keys.ENTER);
                break;
            }
        }
    }

}
