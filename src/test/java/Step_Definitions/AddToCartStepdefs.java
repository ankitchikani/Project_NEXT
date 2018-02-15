package Step_Definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.HookBody;
import pageobject.BasketBagPage;
import pageobject.HomePage;
import pageobject.ProductDiscriptionPage;
import pageobject.ProductImagePage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddToCartStepdefs  {

    HomePage homePage= new HomePage();
    ProductImagePage productImagePage=new ProductImagePage();
    ProductDiscriptionPage productDiscriptionPage=new ProductDiscriptionPage();
    BasketBagPage basketBagPage=new BasketBagPage();
    public String ActualProductName;
    public String ActualProductCode;
    public String ExpectedProductName;
    public String ExpectedProductCode;


    @Given("^I am on Homepage$")
    public void iAmOnHomepage() throws Throwable {

    }

    @When("^I hoover on Department \"([^\"]*)\"$")
    public void iHooverOnDepartment(String arg0) throws Throwable {
        homePage.hooverOnDepartment("Home & Furniture");
    }

    @And("^I hoover on SubDepartment \"([^\"]*)\"$")
    public void iHooverOnSubDepartment(String arg0) throws Throwable {
        homePage.hooverOnSubDepartments("Kitchen & Dining");

    }

    @And("^I select product category \"([^\"]*)\"$")
    public void iSelectProductCategory(String arg0) throws Throwable {
        homePage.selectProduct("Dining Room Furniture");

    }

    @And("^I select and click on Product from Image \"([^\"]*)\"$")
    public void iSelectAndClickOnProductFromImage(String arg0) throws Throwable {
        productImagePage.SelectProductfromImage("Hudson Small Sideboard");
    }

    @And("^I click to Add to Basket$")
    public void iClickToAddToBasket() throws Throwable {
        productDiscriptionPage.getNameofProduct();
        ActualProductName=productDiscriptionPage.getNameofProduct();

        productDiscriptionPage.getProductCode();
        ActualProductCode=productDiscriptionPage.getProductCode();
        productDiscriptionPage.ClickonAddToCart();

    }

    @And("^I click to Shopping Bag$")
    public void iClickToShoppingBag() throws Throwable {
        productDiscriptionPage.ClickOnShoppingBag();

    }

    @And("^I Hoover on shoppingbag and click on \"([^\"]*)\"$")
    public void iHooverOnShoppingbagAndClickOn(String arg0) throws Throwable {
        productDiscriptionPage.hooveOnShoppingBagandClick("VIEW/EDIT BAG");
        basketBagPage.getExpectedProductName();
        ExpectedProductName=basketBagPage.getExpectedProductName();

        basketBagPage.getExpectedProductCode();
        ExpectedProductCode=basketBagPage.getExpectedProductCode();

    }

    @Then("^I should see and verify ProductName$")
    public void iShouldSeeAndVerifyProductName() throws Throwable {
        assertThat(ActualProductName,is(equalTo(ExpectedProductName)));

    }

    @Then("^I should see and verify Productcode$")
    public void iShouldSeeAndVerifyProductcode() throws Throwable {
        assertThat(ActualProductCode,is(equalTo(ExpectedProductCode)));

    }
}
