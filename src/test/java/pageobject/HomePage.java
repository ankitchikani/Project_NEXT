package pageobject;

import mydrivers.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HomePage extends DriverBase {

    public boolean iAMonHomePage(){
        System.out.println(" HOME PAGE");
        return driver.getTitle().endsWith("co.uk");
    }

    public void hooverOnDepartment(String department){
        List<WebElement> Departments= driver.findElements(By.cssSelector(".DepartmentText"));
        for (WebElement element: Departments){

            if (element.getText().equalsIgnoreCase(department)){
                new Actions(driver).moveToElement(element).build().perform();
                //element.click();
                break;
            }
        }
    }

    public void hooverOnSubDepartments(String Subdepartments){
        List<WebElement> subdepartments= driver.findElements(By.cssSelector(".subDepts>li"));
        for(WebElement element: subdepartments){
            if (element.getText().equalsIgnoreCase(Subdepartments)){
                new Actions(driver).moveToElement(element).build().perform();
                break;
            }
        }
    }

    public void hooverOnProductName(String ProductName){
        List<WebElement> Productname= driver.findElements(By.cssSelector(".Text"));
        for ( WebElement element:Productname){
            if (element.getText().equalsIgnoreCase(ProductName)){
               // new Actions(driver).moveToElement(element).build().perform();
                //element.getAttribute("Title").equalsIgnoreCase(ProductName);
                element.click();
                break;
            }
        }

    }
    public void selectProduct(String Productname){
        driver.findElement(By.linkText(Productname)).click();


    }
}
