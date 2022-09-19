package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends ObjectPage{
	
	
	public ProductDetailsPage(WebDriver webdriver) {
		super(webdriver);
	}

	@FindBy(id="add_to_cart")
	WebElement Addtocart;
	
	@FindBy(id="layer_cart_product_quantity")
	WebElement quantityItem;
	
	@FindBy(id="our_price_display")
	WebElement ProductPrice;
	
	@FindBy(id="our_price_display")
	WebElement CheckoutProductPrice;
	
	@FindBy(xpath="//span[contains(text(),\"checkout\")]")
	WebElement proceedCheckout;
	
	
	
	
	public WebElement Addtocart()
	{
		return Addtocart;
	}
	public WebElement quantityItem()
	{
		return quantityItem;
	}
	public WebElement ProductPrice()
	{
		return ProductPrice;
	}
	public WebElement CheckoutProductPrice()
	{
		return CheckoutProductPrice;
	}
	public WebElement proceedCheckout()
	{
		return proceedCheckout;
	}

}
