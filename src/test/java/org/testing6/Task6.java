package org.testing6;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Task6 extends Base_class{
	
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
         Date d=new Date();
         System.out.println(d);
         
	}

	
	@After
	public void endTime() {
         Date d=new Date();
         System.out.println(d);

   }
	
	@Test
	public void tc1() throws InterruptedException {
	      launchUrl("http://adactinhotelapp.com/");
	      LoginPojo5 a=new LoginPojo5();
			find(a.getUser(), "priyasuresh221");
			
			find(a.getPass(), "supriya16");
			btnClick(a.getLogin());
			
			
			SearchPojo5 b=new SearchPojo5();
			selectText(b.getSelectLocation(), "London");
			
			selectText(b.getSelectHotel(), "Hotel Sunshine");
			
			selectText(b.getSelectRoom(), "Deluxe");
			
			selectText(b.getNoOfroom(), "2 - Two");
			
			find(b.getDateIn(), "25-01-2021");
			
			find(b.getDateOut(), "28-01-2021");
			
	        selectText(b.getAdult(), "2 - Two");
			
			selectText(b.getChildRoom(), "2 - Two");
			
			btnClick(b.getClikSubmit());
			
			
			SelectPojo5 c=new SelectPojo5();
			btnClick(c.getClikselect());
			
			btnClick(c.getClikContinue());
			
			
			BookHotelPojo5 d=new BookHotelPojo5();
			find(d.getName(), "sara");
			
			find(d.getLastName(), "R");
			
			find(d.getAddress(), "xxxxx");
			
			find(d.getCcNumber(), "1234567890123456");
			
			find(d.getCcType(), "VISA");
			
			find(d.getExpMonth(), "March");
			
			find(d.getExpYear(), "2021");
			
			find(d.getCvvNumber(), "123");
			
			btnClick(d.getClikBookNow());
	        
			BookingConfirmPojo5 e=new BookingConfirmPojo5();
			Thread.sleep(7000);
             String att = Attribute(e.getOrderNumber());
             System.out.println(att);
 		}


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

