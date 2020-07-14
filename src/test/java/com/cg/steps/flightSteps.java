package com.cg.steps;

import com.cg.testbase.BaseClass;
import com.cg.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class flightSteps extends CommonMethods{
	@Given("User navigates to the make my trip home page in chrome browser")
	public void user_navigates_to_the_make_my_trip_home_page_in_chrome_browser() {
	  		BaseClass.setUp("chrome");
	}
 
	@When("user enters {string} and  {string} of the journey")
	public void user_enters_and_of_the_journey(String source, String destination) {
	    wait(10);
		jsClick(home.fromCity);
	    getListTextandjsClick(home.listOfCities,source);
	    getListTextandjsClick(home.listOfCities,destination);
	    wait(10);
	    getListTextandjsClick(home.dates,"23");
	    jsClick(home.search);
	}

	@When("User select the evening flight")
	public void user_select_the_evening_flight() {
		  wait(10);
		   
		 //jsClick(booking.selectEveningFlight);
}

	@Then("User Select the Flight for his journey")
	public void user_Select_the_Flight_for_his_journey() {
		wait(10);
		 jsClick(booking.clickBookNow);
		 
  }
	//@Given("User navigates to the make my trip home page in ie browser")
//	public void user_navigates_to_the_make_my_trip_home_page_in_ie_browser() {
	//	BaseClass.setUp("ie");
	
	//}

}
