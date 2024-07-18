package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class ProductPage extends BaseClass {
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement SearchBox;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement ClickSearchButton;

	@FindBy(xpath = "//button[@id='a-autoid-6-announce']")
	private WebElement AddToCatt1productButton;

	@FindBy(xpath="//button[@id='a-autoid-7-announce']")
	private WebElement AddToCatt2productButton;
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

	public void ProcductValidate(String Product) {
		SearchBox.sendKeys(Product);
		ClickSearchButton.click();
		AddToCatt1productButton.click();
		AddToCatt2productButton.click();
	}

}
