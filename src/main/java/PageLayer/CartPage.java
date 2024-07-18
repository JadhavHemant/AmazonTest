package PageLayer;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class CartPage extends BaseClass {
	@FindBy(xpath="//a[@href='/gp/cart/view.html?ref_=nav_cart']")
	private WebElement Cart;
	
	
	@FindBy(xpath="//span[@class='a-truncate-cut']")
	 private List<WebElement> MobileNames; 
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}

	

	public List<String> getProductNamesInCart() {
        Cart.click();
        List<String> productNames = new ArrayList<>();
        for (WebElement mobileName : MobileNames) {
            productNames.add(mobileName.getText());
        }
        return productNames;
  
	}
}
