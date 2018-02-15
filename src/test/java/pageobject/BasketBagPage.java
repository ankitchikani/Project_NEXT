package pageobject;

import mydrivers.DriverBase;
import org.openqa.selenium.By;

public class BasketBagPage extends DriverBase {

    public String ExpectedProductName;
    public String ExpectedProductCode;

    public String getExpectedProductName(){
        ExpectedProductName=driver.findElement(By.cssSelector(".itemName")).getText();
        System.out.println(ExpectedProductName);
        return ExpectedProductName;
    }

    public String getExpectedProductCode(){
        ExpectedProductCode=driver.findElement(By.cssSelector(".itemNumber")).getText();
        System.out.println(ExpectedProductCode);
        return ExpectedProductCode;
    }
}