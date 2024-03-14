package com.commerce.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.commerce.generic.BaseClass1;
import com.commerce.generic.Filelib1;
import com.commerce.pom.Login;

@Listeners(com.commerce.generic.ListenerImplementation2.class)

public class LoginToAppl extends BaseClass1{
@Test
public void testverifyLogin() throws InterruptedException, EncryptedDocumentException, IOException {
	Login l=new Login(driver);
	Filelib1 f=new Filelib1();
	l.getLogin().click();
	Thread.sleep(2000);
	String email = f.getExcelData("name", 1, 5);
	l.getEmail().sendKeys(email);
	Thread.sleep(2000);
	String password = f.getExcelData3("password", 1, 3);
	l.getPass().sendKeys(password);
	Thread.sleep(2000);
	l.getRemember().click();
	Thread.sleep(2000);
	l.getloginBtn().click();
}
}
