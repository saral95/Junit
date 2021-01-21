package org.testing;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task1 extends Base_class{
	
	@BeforeClass
	public static void launchBrowser() {
           chromeBrowser();
           maximizeWindow();
           
	}
	
	@AfterClass
	public static void title() {
		String tit = pageTitle();
		System.out.println(tit);
	}
	
	
	
	@Test
	public void tc1() {
      launchUrl("https://www.facebook.com/");
      WebElement email = driver.findElement(By.id("email"));
		find(email,"sarakennedy0611@gmail.com");
		String attr = Attribute(email);
		Assert.assertEquals("check the username", "sarakennedy0611@gmail.com", attr);
		WebElement pass = driver.findElement(By.id("pass"));
		find(pass, "12345");
		String attr1 = Attribute(pass);
		Assert.assertEquals("check the password", "12345", attr1);
		WebElement login = driver.findElement(By.id("u_0_b"));
		btnClick(login);
	}

}
