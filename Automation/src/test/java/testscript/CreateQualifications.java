package testscript;

import java.io.IOException;

import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.FileLib;
import pom.AddQualification;

@Listeners(generic.ListenerImplementation2.class)
public class CreateQualifications extends BaseClass{
@Test
public void testaddDetails() throws InterruptedException, EncryptedDocumentException, IOException {
	Reporter.log("addDetails",true);
	FileLib f=new FileLib();
	AddQualification a=new AddQualification(driver);
	a.getadmin().click();
	Thread.sleep(2000);
	a.getDetails().click();
	Thread.sleep(2000);
	a.getSkills().click();
	Thread.sleep(2000);
	a.getAddButton().click();
	Thread.sleep(2000);
	String name = f.getExcelData4("Sheet1", 3, 1);
	a.getName().sendKeys(name);
	Thread.sleep(2000);
	String des = f.getExcelData5("Sheet2", 0, 0);
	a.gettDescription().sendKeys(des);
	Thread.sleep(2000);
	a.getSubmit().click();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.textToBePresentInElement(a.getActualName(), name));
	String actualtext = a.getActualName().getText();
	Assert.assertEquals(actualtext, name);
	
}
}
