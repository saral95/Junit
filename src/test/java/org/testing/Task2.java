package org.testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Task2 extends Base_class{
	
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
	private void tc1() throws InterruptedException {
      launchUrl("https://www.redbus.in/");
       driver.findElement(By.id("sign-in-icon-down")).click();
		removePopup();
		Thread.sleep(5000);
		driver.findElement(By.id("signInLink")).click();
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame1);
		WebElement mnum = driver.findElement(By.id("mobileNoInp"));
		find(mnum, "7639635053");
		
	}

}
