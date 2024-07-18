package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.ProductPage;

public class ProductPageTest extends BaseClass {

	@Test
	public void ProcductValidate() {
		ProductPage page = new ProductPage();
		String product = "samsung 5g mobile";
		page.ProcductValidate(product);
	}

}
