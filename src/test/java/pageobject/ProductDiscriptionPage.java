package pageobject;

import mydrivers.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ProductDiscriptionPage extends DriverBase {
    public String ActualProductName;
    public String ActualProductCode;
    public String ActualProductQuantity;

    public String getNameofProduct(){
        ActualProductName=driver.findElement(By.cssSelector(".Title>h1")).getText();
        System.out.println(ActualProductName);
        return ActualProductName;
    }

    public String getProductCode(){
        ActualProductCode= driver.findElement(By.xpath("html/body/section[1]/section[1]/div[1]/div[2]/div[2]/div[1]/section[2]/article[1]/section[2]/div[3]/div[2]")).getText();
        System.out.println(ActualProductCode);
        return ActualProductCode;
    }

    public void ClickonAddToCart(){
        driver.findElement(By.xpath("html/body/section[1]/section[1]/div[1]/div[2]/div[2]/div[1]/section[2]/article[1]/section[2]/div[4]/div[7]/div/a[1]")).click();
    }

    public void ClickOnShoppingBag(){
        driver.findElement(By.cssSelector(".BagSummary")).click();
    }

    public void hooveOnShoppingBagandClick(String viewOrCheckout) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(viewOrCheckout=="VIEW/EDIT BAG"){
            driver.findElement(By.cssSelector(".view_edit_bag")).click();
        }
        else if(viewOrCheckout=="CHECKOUT"){
            driver.findElement(By.cssSelector(".checkout")).click();
        }





    }
}
