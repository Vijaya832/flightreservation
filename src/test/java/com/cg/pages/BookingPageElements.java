package com.cg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cg.testbase.BaseClass;

public class BookingPageElements {

	@FindBy (xpath="(//p[contains(text(),'After')])[1]")
	
	

	public WebElement selectEveningFlight;
	
	@FindBy (xpath="//button[text()='Book Now']")
	public WebElement clickBookNow;
	
	public BookingPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	

}
