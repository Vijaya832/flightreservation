Feature: Flight Booking in make my trip application
Scenario Outline: Book the flight with least fare with chrome browser
    Given User navigates to the make my trip home page in chrome browser
    When user enters "<source>" and  "<destination>" of the journey
    And User select the evening flight
    Then User Select the Flight for his journey
Examples:
|source            |destination|
|Hyderabad, India  |Bangalore, India|
|Hyderabad, India  |Chennai, India|