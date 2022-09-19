package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.ProductDetailsPage;
import UITestFramework.FrameworkTest;

public class RespondAssesmentTest extends FrameworkTest {

	@Test
	public void Scenario1Test() throws InterruptedException
	{
		String searchItem = "Printed";
		HomePage homepage = new HomePage(driver);
		homepage.loginApplication(driver);
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("My Store"), "Page not loaded correctly");
     	homepage.SearchTextBox().click();
     	homepage.SearchTextBox().sendKeys(searchItem);
     	homepage.SearchButton().click();
     	for (WebElement webElement : homepage.SearchResults()) {
              String resultname = webElement.getAttribute("text");
              Assert.assertTrue(resultname.contains(searchItem), "Search Results not working Correctly");
     	      }        		
	}	
	
	@Test
	public void Scenario2Test() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		HomePage homepage = new HomePage(driver);
		homepage.loginApplication(driver);
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("My Store"), "Page not loaded correctly");
     	homepage.WomenLink().click();
     	homepage.SelectCategory().click();
     	wait.until(ExpectedConditions.elementToBeClickable(homepage.SelectColor()));
     	JavascriptExecutor jse = (JavascriptExecutor)driver;
     	jse.executeScript("arguments[0].scrollIntoView(true);", homepage.SelectColor());
     	homepage.SelectColor().click();
       	wait.until(ExpectedConditions.elementToBeClickable(homepage.SelectColor()));
       	Assert.assertTrue(homepage.SearchListProducts().isDisplayed(), "");
     	    	
     
	}	
		
	@Test
	public void Scenario3Test() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		HomePage homepage = new HomePage(driver);
		homepage.loginApplication(driver);
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("My Store"), "Page not loaded correctly");
     	homepage.ProductList().get(1).click();
     	ProductDetailsPage productDetails = new ProductDetailsPage(driver);
     	productDetails.Addtocart().click();
     	String price = productDetails.ProductPrice().getText();
     	Assert.assertTrue(driver.getPageSource().contains("Product successfully added to your shopping cart"),"Product not sccessfully added to cart");
      	wait.until(ExpectedConditions.elementToBeClickable(productDetails.proceedCheckout()));
     	Assert.assertEquals(Integer.parseInt(productDetails.quantityItem().getText()),1);
     	Assert.assertEquals(price, productDetails.CheckoutProductPrice().getText());
    
	}	
			
}
