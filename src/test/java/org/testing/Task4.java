package org.testing;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task4 extends Base_class{
	
	@BeforeClass
	public static void launchBrowser() {
           chromeBrowser();
           maximizeWindow();
           
	}
	
	@AfterClass
	public static void close() {
		closeBrowser();
		}
	
	@Before
	public void startTime() {
        Date d =new Date();
        System.out.println(d);
	}
	
	@After
	public void endTime() {
       Date d=new Date();
       System.out.println(d);
	}
	
	
	@Test
	public void tc1() {
      launchUrl("https://www.flipkart.com/account/login");
      WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		find(email,"sarakennedy0611@gmail.com");
		String attr = Attribute(email);
		Assert.assertEquals("check the username", "sarakennedy0611@gmail.com", attr);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		find(pass, "12345");
		String attr1 = Attribute(pass);
		Assert.assertEquals("check the password", "12345", attr1);
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btnClick(login);
	}

}
