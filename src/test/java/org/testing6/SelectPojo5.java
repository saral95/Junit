package org.testing6;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPojo5 extends Base_class{
	public SelectPojo5() {
     PageFactory.initElements(driver,  this);	

	}
	
	@FindBy(id="radiobutton_0")
	private WebElement clikselect;
	
	@FindBy(id="continue")
	private WebElement clikContinue;

	public WebElement getClikselect() {
		return clikselect;
	}

	public WebElement getClikContinue() {
		return clikContinue;
	}
	
	

}
