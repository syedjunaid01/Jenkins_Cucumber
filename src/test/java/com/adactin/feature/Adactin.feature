Feature: Book A Hotels in Adactin Application

Scenario: User Login the Adactin Application
Given user launch the adactin application
When User Enter the Username In Username Field
And User Enter the Password in Password Field
Then User Click the Login Button And It Will Navigate to Next Page

Scenario: User Search Hotels in Adactin Application
When user select the Hotel location from drop down list field
And User select the Hotel from the drop down  List Field 
And User Select the Room Type from the drop down List Field
And User Select the Number of Room from the drop down Field
And User Type the Check in Date in the prescribed Format in Check in Date Field
And User Type the Check Out Date in the Prescribed Format in Check Out Date Field
And User Select the Adults per Room from the drop down List field
And User Select the Children Per Room from the drop Down List Field
Then User Click On the Search Button 

Scenario: User Confims the Selected Hotel
When User Select the Hotel by Clicking the Radio Button
Then User Click on the Continue Button, it Will Navigate to Book a Hotel Page

Scenario: User Provide the User Details to Book the Hotel
When User Enters First Name in the First Name Field
When User Enters the Last Name in the Last Name Field
When User Enters the Address the Billing Address Field
When User Enters the Credit Card Number in the Credit Card Number Field
When User Select the Credit Card Type from the Drop Down List Field
When User Select the Expiry Date from the Select Month and Year in thge  Drop Down Filed 
When User Enters the CVV Number in the CVV Field
Then User Click on the Book Now and it will Navigate to the Booking Confimation Page

Scenario: User LogOut from Adactin Application
When User Select the My Itinerary Button 
Then  User Click the My Itinerary Button to Logout
