package com.cg.testbase;

import com.cg.pages.BookingPageElements;
import com.cg.pages.HomePageElements;

//initializes all pages class and stores references in static varibales
//that will called/used in test classes
public class PageInitializer extends BaseClass{

	public static HomePageElements home;
	public static BookingPageElements booking;
	public static void initialize() {
		
		home=new HomePageElements();
		booking=new BookingPageElements();
	}
}
