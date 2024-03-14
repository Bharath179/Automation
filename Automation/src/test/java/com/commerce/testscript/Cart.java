package com.commerce.testscript;

import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.commerce.generic.BaseClass1;
import com.commerce.pom.AddToCart;

public class Cart extends BaseClass1{
@Test
public void testverifyCart() throws InterruptedException {
	Reporter.log("verifyCart",true);
	AddToCart a=new AddToCart(driver);
	a.getElectronics().click();
	a.getMobiles().click();
	a.getMobile().click();
	Thread.sleep(2000);
	a.getAddToCart().click();
	Thread.sleep(2000);
	while(true) {
	try {
		a.getCartBtn().click();
	    break;
	} catch (ElementClickInterceptedException e) {
	}
	}
	//a.getCartBtn().click();
	
}
}
