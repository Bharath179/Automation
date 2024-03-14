package com.commerce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a[text()='Electronics ']")
	private WebElement clickonelectronics;
	
	@FindBy(xpath = "//img[@alt='Picture for category Cell phones']")
	private WebElement clickonmobile;
	
	@FindBy(xpath = "//h2[@class='product-title']/a[text()='HTC One M8 Android L 5.0 Lollipop']")
	private WebElement clickontitle;
	
	@FindBy(xpath = "//button[@id='add-to-cart-button-18']")
	private WebElement addtocart;
	
	@FindBy(id = "topcartlink")
    private WebElement cart;
	
	
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getElectronics() {
		return clickonelectronics;
	}
	public WebElement getMobiles() {
		return clickonmobile;
	}
	public WebElement getMobile() {
		return clickontitle;
	}
	public WebElement getAddToCart() {
		return addtocart;
	}
	public WebElement getCartBtn() {
		return cart;
	}
	
}
