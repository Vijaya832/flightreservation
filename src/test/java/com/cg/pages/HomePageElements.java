package com.cg.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cg.testbase.BaseClass;
import com.cg.utils.CommonMethods;

public class HomePageElements extends CommonMethods  {

	
//	@FindBy (xpath="//span[text()='From']//following::input[@id='fromCity']")
//	public WebElement fromCity;
	
	@FindBy (xpath="//label[@for='fromCity']")
	public WebElement fromCity;
	
	
	@FindBy (xpath="//ul[@role='listbox']//li")
	public List<WebElement> listOfCities;
	
	@FindBy (xpath="//div[@class='DayPicker-Day']//p[1]")
	public List<WebElement> dates;
	
	@FindBy (xpath="//a[contains(text(),'Search')]")
	public WebElement search;
	
	
	
	
	
	public HomePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	
	
}
