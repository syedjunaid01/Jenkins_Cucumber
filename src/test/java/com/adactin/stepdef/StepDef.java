package com.adactin.stepdef;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Runner;
import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Tha;

public class StepDef {
	public static WebDriver driver = Runner.driver ;
	
	@Given("user launch the adactin application")
	public void user_launch_the_adactin_application() {
	   driver.get("https://adactinhotelapp.com/index.php");
	}
	
	@When("User Enter the Username In Username Field")
	public void user_enter_the_username_in_username_field() {
		WebElement username1 = driver.findElement(By.xpath("//input[@type='text']"));
		username1.sendKeys("Syedjunaid93");
	}
	@When("User Enter the Password in Password Field")
	public void user_enter_the_password_in_password_field() {
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("Junaid@1");
	}
	
	@Then("User Click the Login Button And It Will Navigate to Next Page")
	public void user_click_the_login_button_and_it_will_navigate_to_next_page() {
		WebElement Loginbutton = driver.findElement(By.xpath("//input[@name='login']"));
		Loginbutton.click();  
	}


@When("user select the Hotel location from drop down list field")
public void user_select_the_hotel_location_from_drop_down_list_field() {
	WebElement Locationlist = driver.findElement(By.xpath("//select[@class='search_combobox']"));
	Select s = new Select(Locationlist);
	s.selectByIndex(5);
}

@When("User select the Hotel from the drop down  List Field")
public void user_select_the_hotel_from_the_drop_down_list_field() {
	WebElement Hotellist = driver.findElement(By.xpath("//select[@name='hotels']"));
	Select s1 = new Select(Hotellist);
	s1.selectByValue("Hotel Sunshine");
}

@When("User Select the Room Type from the drop down List Field")
public void user_select_the_room_type_from_the_drop_down_list_field() {
	WebElement RoomTYPE = driver.findElement(By.xpath("//select[@name='room_type']"));
	Select s2 = new Select(RoomTYPE);
	s2.selectByValue("Double");
}
@When("User Select the Number of Room from the drop down Field")
public void user_select_the_number_of_room_from_the_drop_down_field() {
	WebElement RoomNos = driver.findElement(By.xpath("//select[@name='room_nos']"));
	Select s3 = new Select(RoomNos);
	s3.selectByIndex(3);
}

@When("User Type the Check in Date in the prescribed Format in Check in Date Field")
public void user_type_the_check_in_date_in_the_prescribed_format_in_check_in_date_field() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}
@When("User Type the Check Out Date in the Prescribed Format in Check Out Date Field")
public void user_type_the_check_out_date_in_the_prescribed_format_in_check_out_date_field() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@When("User Select the Adults per Room from the drop down List field")
public void user_select_the_adults_per_room_from_the_drop_down_list_field() {
	WebElement AdultsperRoom = driver.findElement(By.xpath("//select[@name='adult_room']"));
	Select s4 = new Select(AdultsperRoom);
	s4.selectByIndex(3);
}

@When("User Select the Children Per Room from the drop Down List Field")
public void user_select_the_children_per_room_from_the_drop_down_list_field() {
	WebElement childperroom = driver.findElement(By.xpath("//select[@id='child_room']"));
	Select s5 = new Select(childperroom);
	s5.selectByIndex(2);
}

@Then("User Click On the Search Button")
public void user_click_on_the_search_button() {
	WebElement Seachbutton = driver.findElement(By.xpath("//input[@type='submit']"));
	Seachbutton.click();
}

@When("User Select the Hotel by Clicking the Radio Button")
public void user_select_the_hotel_by_clicking_the_radio_button() {
	WebElement Radio1 = driver.findElement(By.id("radiobutton_0"));
	Radio1.click();
}

@Then("User Click on the Continue Button, it Will Navigate to Book a Hotel Page")
public void user_click_on_the_continue_button_it_will_navigate_to_book_a_hotel_page() {
	WebElement Cntnu = driver.findElement(By.xpath("//input[@name='continue']"));
	Cntnu.click();
}
	
@When("User Enters First Name in the First Name Field")
public void user_enters_first_name_in_the_first_name_field() {
	WebElement firstname = driver.findElement(By.id("first_name"));
	firstname.sendKeys("Syed Junaid");
}
@When("User Enters the Last Name in the Last Name Field")
public void user_enters_the_last_name_in_the_last_name_field() {
	WebElement lastname = driver.findElement(By.id("last_name"));
	lastname.sendKeys("Hussain");
}

@When("User Enters the Address the Billing Address Field")
public void user_enters_the_address_the_billing_address_field() {
	WebElement address = driver.findElement(By.xpath("//textarea[@class='txtarea']"));
	address.sendKeys("Madhavaram,Chennai,Tamil Nadu");
}

@When("User Enters the Credit Card Number in the Credit Card Number Field")
public void user_enters_the_credit_card_number_in_the_credit_card_number_field() {
	WebElement CCNO = driver.findElement(By.xpath("//input[@name='cc_num']"));
	CCNO.sendKeys("1234567891012131");
}

@When("User Select the Credit Card Type from the Drop Down List Field")
public void user_select_the_credit_card_type_from_the_drop_down_list_field() {
	WebElement CCtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
	Select s6 = new Select(CCtype);
	s6.selectByIndex(2);
}

@When("User Select the Expiry Date from the Select Month and Year in thge  Drop Down Filed")
public void user_select_the_expiry_date_from_the_select_month_and_year_in_thge_drop_down_filed() {
	WebElement expiry = driver.findElement(By.id("cc_exp_month"));
	Select s7 = new Select(expiry);
	s7.selectByIndex(5);
	WebElement CCyear = driver.findElement(By.id("cc_exp_year"));
	Select s8 = new Select(CCyear);
	s8.selectByIndex(16);
}

@When("User Enters the CVV Number in the CVV Field")
public void user_enters_the_cvv_number_in_the_cvv_field() {
	WebElement CCV = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	CCV.sendKeys("213");
}
@Then("User Click on the Book Now and it will Navigate to the Booking Confimation Page")
public void user_click_on_the_book_now_and_it_will_navigate_to_the_booking_confimation_page() throws InterruptedException {
	WebElement Booknow = driver.findElement(By.xpath("//input[@name='book_now']"));
	Booknow.click();
       Thread.sleep(5000);
}

@When("User Select the My Itinerary Button")
public void user_select_the_my_itinerary_button() {
	WebElement itinary = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
	itinary.click();
}

@Then("User Click the My Itinerary Button to Logout")
public void user_click_the_my_itinerary_button_to_logout() throws InterruptedException, IOException {
	Thread.sleep(5000);
	TakesScreenshot ts = (TakesScreenshot) driver;
	File Source = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(
			"C:\\Users\\SYED JUNAID HUSSAIN\\eclipse-workspace\\Selinum_Concepts\\Screenshorts\\Cucumber.png");
         FileUtils.copyFile (Source, dest);
	WebElement logout = driver.findElement(By.xpath("//input[@name='logout']"));
	logout.click();

	
}
}