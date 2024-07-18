package TestLayer;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.CartPage;

public class CartTest extends BaseClass {
    public static CartPage cart;

    @BeforeClass
    public void initializeCartPage() {
        cart = new CartPage();
    }

    @Test
    public void verifyProduct() {
       
        boolean isProductPresent = cart.getProductNamesInCart().stream()
                .anyMatch(name -> name.toLowerCase().contains("samsung"));
        
        Assert.assertTrue(isProductPresent, "Samsung product is not found in the cart.");
    }
}
