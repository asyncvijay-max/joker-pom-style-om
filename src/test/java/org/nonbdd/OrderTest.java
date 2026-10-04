package org.nonbdd;


import org.nonbdd.base.BaseTest;
import org.nonbdd.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderTest extends BaseTest {

    @Test
    public void guestCheckOutOrderConfirmationwithPOM() {

        driver.get("https://askomdch.com/");
        HomePage homePage = new HomePage(driver);
        StorePage storePage = homePage.navigateToStorePagefromHomePage();

        storePage.enterSearchItem("Blue");
        storePage.clickOnSearchItemButton();

        //Assert.assertEquals(storePage.searchItemResultsExtractedText(),"");

      storePage.addProducttoTheCart("Blue Shoes");
      CartPage cartPage = storePage.clickOnViewCartLink();

      CheckOutPage checkOutPage = cartPage.clickOnCheckOutBtn();

      checkOutPage.enterFirstName("Kriranji");
      checkOutPage.enterLastName("krrrori");
      checkOutPage.enterbillingAddress("25rr street");
      checkOutPage.enterbillingCity("New York");
      checkOutPage.enterPostalCode("10001");
      checkOutPage.enterEmail("testajk@test.com");

      OrderConfirmationPage orderConfirmationPage = checkOutPage.placeOrder();

      //String orderconfirmationtext = orderConfirmationPage.orderConfirmationExtractedText();

      //Assert.assertEquals(orderconfirmationtext,"");








    }
}



// https://github.com/asyncvijay-max/seleniumomaskdch-nonbdd-nonpageobjects/blob/main/src/test/java/org/nonbdd/tests/OrderTest.java
