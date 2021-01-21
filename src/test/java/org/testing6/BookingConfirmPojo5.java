package org.testing6;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPojo5 extends Base_class{
	public BookingConfirmPojo5() {
PageFactory.initElements(driver, this);	

	}

@FindBy(xpath="//input[@id='order_no']")
private WebElement orderNumber;

public WebElement getOrderNumber() {
	return orderNumber;
}




}