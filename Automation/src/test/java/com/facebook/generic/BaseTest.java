package com.facebook.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;
	
@BeforeTest
public void openBrowser() {
	Reporter.log("openBrowser",true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@AfterTest
public void closeBrowser() {
	Reporter.log("closeBrowser",true);
	driver.quit();
}

@BeforeMethod
public void login() throws IOException {
	Reporter.log("login",true);
	Filelib f=new Filelib();
	String url = f.getPropertyData("url");
	driver.get(url);
}

@AfterMethod
public void logout(){
	Reporter.log("logout",true);
}
}
