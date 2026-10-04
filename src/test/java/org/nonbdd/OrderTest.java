package org.nonbdd;


import org.nonbdd.base.BaseTest;
import org.nonbdd.pages.*;
import org.nonbdd.pojo.BillingAddress;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderTest extends BaseTest {

    @Test
    public void guestCheckOutOrderConfirmationwithPOM() {

        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setFirstName("raghavvv");
        billingAddress.setLastName("mohanen");
        billingAddress.setBillingAddress("4556 cambridge");
        billingAddress.setCity("New York");
        billingAddress.setZipCode("10006");
        billingAddress.setEmail("charlie34@testing.com");

        driver.get("https://askomdch.com/");
        HomePage homePage = new HomePage(driver);
        StorePage storePage = homePage.navigateToStorePagefromHomePage();

        storePage.enterSearchItem("Blue");
        storePage.clickOnSearchItemButton();

        //Assert.assertEquals(storePage.searchItemResultsExtractedText(),"");

      storePage.addProducttoTheCart("Blue Shoes");
      CartPage cartPage = storePage.clickOnViewCartLink();

      CheckOutPage checkOutPage = cartPage.clickOnCheckOutBtn();

      checkOutPage.setBillingAddress(billingAddress);

//      checkOutPage.enterFirstName("Kriranji");
//      checkOutPage.enterLastName("krrrori");
//      checkOutPage.enterbillingAddress("25rr street");
//      checkOutPage.enterbillingCity("New York");
//      checkOutPage.enterPostalCode("10001");
//      checkOutPage.enterEmail("testajk@test.com");

      OrderConfirmationPage orderConfirmationPage = checkOutPage.placeOrder();

      //String orderconfirmationtext = orderConfirmationPage.orderConfirmationExtractedText();

      //Assert.assertEquals(orderconfirmationtext,"");








    }
}



// https://github.com/asyncvijay-max/seleniumomaskdch-nonbdd-nonpageobjects/blob/main/src/test/java/org/nonbdd/tests/OrderTest.java
