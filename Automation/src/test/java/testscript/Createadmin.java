package testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.FileLib;
import pom.Homepage;

@Listeners(generic.ListenerImplementation2.class)
public class Createadmin extends BaseClass{
@Test
public void testverifyAccount() throws InterruptedException, EncryptedDocumentException, IOException {
	Reporter.log("Createadmin",true);
	FileLib f=new FileLib();
	Homepage h=new Homepage(driver);
	Thread.sleep(2000);
	h.getadmin().click();
	h.getaddBtn().click();
	Thread.sleep(2000);
	h.getuser().click();
	Thread.sleep(2000);
	h.getEss().click();
	Thread.sleep(2000);
	h.getStatus().click();
	Thread.sleep(2000);
	h.getEnabledoption().click();
	Thread.sleep(2000);
	
	String en = f.getExcelData("empname", 1, 2);
	h.getEmpname().sendKeys(en);
	
	Thread.sleep(2000);
	
	String un = f.getExcelData1("name", 1, 2);
	h.getUsername().sendKeys(un);
	
	Thread.sleep(2000);
	String pw = f.getExcelData2("password", 1, 2);
	h.getPassword().sendKeys(pw);
	
	Thread.sleep(2000);
	String cpw = f.getExcelData3("conpass", 1, 2);
	h.getConpassword().sendKeys(cpw);
	
	Thread.sleep(2000);
	h.getSave().click();	
}
}
