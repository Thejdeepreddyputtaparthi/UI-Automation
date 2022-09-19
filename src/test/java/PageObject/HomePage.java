package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ObjectPage {
	

	@FindBy(id="search_query_top")
	WebElement SearchTextBox;
	
	@FindBy(xpath="//*[@id=\"searchbox\"]/button")
	WebElement SearchButton;
	
	@FindBy(xpath="//*[@id=\"center_column\"]//a[contains(text(),\"Printed\")]")
	List<WebElement>  SearchResults;
	
	@FindBy(xpath="//a[text()=\"Women\"]")
	WebElement WomenLink;
	
	@FindBy(id="uniform-layered_category_4")
	WebElement SelectCategory;
	
	@FindBy(xpath="//a[text()=\"Black\"]")
	WebElement SelectColor;
	
	@FindBy(css="#homefeatured .product-container")
	List<WebElement> ProductList;
	
	@FindBy(xpath="//ul[@class=\"product_list grid row\"]")
	WebElement SearchListProducts;

	
	

	
	
	public HomePage(WebDriver webdriver)
	{
	super(webdriver);
	}	
	public WebElement SearchTextBox()
	{
		return SearchTextBox;
	}
	public WebElement SearchButton()
	{
		return SearchButton;
	}
	public List<WebElement>  SearchResults()
	{
		return SearchResults;
	}
	public WebElement WomenLink()
	{
		return WomenLink;
	}
	public WebElement SelectCategory()
	{
		return SelectCategory;
	}
	public WebElement SelectColor()
	{
		return SelectColor;
	}
	public List<WebElement>  ProductList()
	{
		return ProductList;
	}
	public WebElement  SearchListProducts()
	{
		return SearchListProducts;
	}

	
	
	public void loginApplication(WebDriver webdriver) throws InterruptedException {
		
	   webdriver.get("http://automationpractice.com");	
	}
}
