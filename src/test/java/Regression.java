import org.hamcrest.CoreMatchers;
import org.junit.Test;
import pageobject.BasketBagPage;
import pageobject.HomePage;
import pageobject.ProductDiscriptionPage;
import pageobject.ProductImagePage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Regression  {
    HomePage homePage= new HomePage();
    ProductImagePage productImagePage=new ProductImagePage();
    ProductDiscriptionPage productDiscriptionPage=new ProductDiscriptionPage();
    BasketBagPage basketBagPage=new BasketBagPage();
    public String ActualProductName;
    public String ActualProductCode;
    public String ExpectedProductName;
    public String ExpectedProductCode;

    @Test
    public void hoover(){
        homePage.hooverOnDepartment("Home & Furniture");
        homePage.hooverOnSubDepartments("Kitchen & Dining");
        homePage.selectProduct("Dining Room Furniture");
        productImagePage.SelectProductfromImage("Hudson Small Sideboard");

        productDiscriptionPage.getNameofProduct();
        ActualProductName=productDiscriptionPage.getNameofProduct();

        productDiscriptionPage.getProductCode();
        ActualProductCode=productDiscriptionPage.getProductCode();
        productDiscriptionPage.ClickonAddToCart();
        productDiscriptionPage.ClickOnShoppingBag();
        //productDiscriptionPage.hooveOnShoppingBagandClick("CHECKOUT");
        productDiscriptionPage.hooveOnShoppingBagandClick("VIEW/EDIT BAG");

        basketBagPage.getExpectedProductName();
        ExpectedProductName=basketBagPage.getExpectedProductName();

        basketBagPage.getExpectedProductCode();
        ExpectedProductCode=basketBagPage.getExpectedProductCode();

        assertThat(ActualProductName,is(equalTo(ExpectedProductName)));
        assertThat(ActualProductCode,is(equalTo(ExpectedProductCode)));

    }
}
