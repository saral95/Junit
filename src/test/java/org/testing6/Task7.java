package org.testing6;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Task7 extends Base_class{
	
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
	public void tc1() throws InterruptedException, IOException {
	      launchUrl("http://adactinhotelapp.com/");
	      LoginPojo5 a=new LoginPojo5();
			find(a.getUser(), excel(1,0));
			
			find(a.getPass(), excel(1,1));
			btnClick(a.getLogin());
			
			
			SearchPojo5 b=new SearchPojo5();
			selectText(b.getSelectLocation(), excel(1,2));
			
			selectText(b.getSelectHotel(), excel(1,3));
			
			selectText(b.getSelectRoom(), excel(1,4));
			
			selectText(b.getNoOfroom(), excel(1,5));
			
			find(b.getDateIn(), excel(1,6));
			
			find(b.getDateOut(), excel(1,7));
			
	        selectText(b.getAdult(), excel(1,8));
			
			selectText(b.getChildRoom(), excel(1,9));
			
			btnClick(b.getClikSubmit());
			
			
			SelectPojo5 c=new SelectPojo5();
			btnClick(c.getClikselect());
			
			btnClick(c.getClikContinue());
			
			
			BookHotelPojo5 d=new BookHotelPojo5();
			find(d.getName(), excel(1,10));
			
			find(d.getLastName(), excel(1,11));
			
			find(d.getAddress(), excel(1,12));
			
			find(d.getCcNumber(), excel(1,13));
			
			find(d.getCcType(),excel(1,14));
			
			find(d.getExpMonth(), excel(1,15));
			
			find(d.getExpYear(), excel(1,16));
			
			find(d.getCvvNumber(), excel(1,17));
			
			btnClick(d.getClikBookNow());
	        
			BookingConfirmPojo5 e=new BookingConfirmPojo5();
			Thread.sleep(7000);

			String attr = Attribute(e.getOrderNumber());
			System.out.println(attr);
			excelWrite(1, 18, attr);
			
		}


}
