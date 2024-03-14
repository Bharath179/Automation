package com.commerce.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.commerce.generic.BaseClass1;
import com.commerce.generic.Filelib1;
import com.commerce.pom.RegisterDetails;

public class Register extends BaseClass1{
	@Test
public void testtestverifyRegister() throws InterruptedException, EncryptedDocumentException, IOException {
	RegisterDetails rd=new RegisterDetails(driver);
	Filelib1 f=new Filelib1();
	rd.getRegister().click();
	Thread.sleep(2000);
	rd.getMaleRadioBtn().click();
	Thread.sleep(2000);
	String username = f.getExcelData("name", 1, 3);
	rd.getFirstname().sendKeys(username);
	Thread.sleep(2000);
	String username1 = f.getExcelData1("surename", 1, 1);
	rd.getLastName().sendKeys(username1);
	Thread.sleep(2000);
	rd.getDay().click();
	Thread.sleep(2000);
	rd.getMonth().click();
	Thread.sleep(2000);
	rd.getYear().click();
	Thread.sleep(2000);
	String email = f.getExcelData("name", 1, 5);
	rd.getEmail().sendKeys(email);
	Thread.sleep(2000);
	String password = f.getExcelData3("password", 1, 3);
	rd.getPassword().sendKeys(password);
	Thread.sleep(2000);
	String password1 = f.getExcelData3("password", 1, 3);
	rd.getConPassword().sendKeys(password1);
	Thread.sleep(2000);
	rd.getsubmit().click();
	
	
}
}
