package com.facebook.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.facebook.generic.BaseTest;
import com.facebook.generic.Filelib;
import com.facebook.pom.SignUp;


@Listeners(com.facebook.generic.ListenerImplementation1.class)
public class CreateAccount extends BaseTest{
	@Test
public void testverifyAccount() throws EncryptedDocumentException, IOException, InterruptedException {
	Reporter.log("verifyAccount",true);
	Filelib f=new Filelib();
	
	SignUp s=new SignUp(driver);
	
	s.getCreateBtn().click();
	
	String nameTextfield = f.getExcelData("namefield", 0, 0);
	s.getfirstnametextField().sendKeys(nameTextfield);
	
	String surenameTextfield = f.getExcelData1("surename", 1, 1);
	s.getLNametextField().sendKeys(surenameTextfield);
	
	String emailTextfield = f.getExcelData2("gmail", 3, 1);
	s.getEmailtextField().sendKeys(emailTextfield);
	
	String passwordTextfield = f.getExcelData3("password", 1, 3);
	s.getPasswordtextField().sendKeys(passwordTextfield);
	
	/*List<WebElement> allDropDowns = driver.findElements(By.tagName("select"));
	for (WebElement dropdown : allDropDowns) {
		
		if(dropdown.isDisplayed()) {
			Select dropdownSelect = new Select(dropdown);
			
			if(dropdown.getAttribute("title").equals("Day")) {
				dropdownSelect.selectByVisibleText("8");
				
				}else if(dropdown.getAttribute("title").equals("Month")) {
					dropdownSelect.selectByVisibleText("Apr");
					
				}else if(dropdown.getAttribute("title").equals("Year")) {
					dropdownSelect.selectByVisibleText("1997");
				}*/
					s.getDay().click();
					s.getMonth().click();
			s.getYear().click();
			
	s.getGender().click();
	Thread.sleep(5000);
	String conemail = f.getExcelData2("gmail", 0, 0);
	s.getConformEmail().sendKeys(conemail);
	s.getSubmitBtn().click();
}

	}
	

