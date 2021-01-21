package org.testing6;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPojo5 extends Base_class{
	
	public SearchPojo5() {
     PageFactory.initElements(driver,  this);
	
	}
	
	@FindBy(id="location")
	private WebElement selectLocation;
	
	@FindBy(id="hotels")
	private WebElement selectHotel;
	
	@FindBy(id="room_type")
	private WebElement selectRoom;
	
	@FindBy(id="room_nos")
	private WebElement noOfroom;
	
	@FindBy(id="datepick_in")
	private WebElement dateIn;
	
	@FindBy(id="datepick_out")
	private WebElement dateOut;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	@FindBy(id="Submit")
	private WebElement clikSubmit;

	public WebElement getSelectLocation() {
		return selectLocation;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getSelectRoom() {
		return selectRoom;
	}

	public WebElement getNoOfroom() {
		return noOfroom;
	}

	public WebElement getDateIn() {
		return dateIn;
	}

	public WebElement getDateOut() {
		return dateOut;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getClikSubmit() {
		return clikSubmit;
	}

	
}
