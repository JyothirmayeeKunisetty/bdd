package com.cg.cra.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.cra.beans.PaymentDetailsPage;
import com.cg.cra.beans.PersonalDetailsPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class ConferenceRegistrationStepDefinitions {

	private WebDriver driver;
	private PersonalDetailsPage personalDetailsPage;
	private PaymentDetailsPage paymentPage;
	
	@Before
	public void setUpEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
	}
	
	@Given("^User opens 'ConferenceRegistration' page$")
	public void user_opens_ConferenceRegistration_page() throws Throwable {
		driver=new ChromeDriver();
		driver.get("D:\\KVS Jyothirmayee\\Module 3\\MPT Set 1\\MPT Set 1\\ConferenceRegistartion.html");
		personalDetailsPage=new PersonalDetailsPage();
		PageFactory.initElements(driver, personalDetailsPage);
	}

	@When("^he clicks 'Next' without entering FirstName$")
	public void he_clicks_Next_without_entering_FirstName() throws Throwable {
		String expected="Conference Registartion";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
	    personalDetailsPage.clickNext();
	    Thread.sleep(2000);
	}

	@Then("^'Please fill the First Name' message must be displayed$")
	public void please_fill_the_First_Name_message_must_be_displayed() throws Throwable {
		String expectedMessage="Please fill the First Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().dismiss();
	}

	@When("^he enters a valid FirstName$")
	public void he_enters_a_valid_FirstName() throws Throwable {
		personalDetailsPage.setFirstName("Jyothi");
		Thread.sleep(2000);
	}

	@When("^he clicks 'Next' without entering LastName$")
	public void he_clicks_Next_without_entering_LastName() throws Throwable {
		personalDetailsPage.clickNext();
		Thread.sleep(2000);
	}

	@Then("^'Please fill the Last Name' message must be displayed$")
	public void please_fill_the_Last_Name_message_must_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Last Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().dismiss();
	}

	@When("^he enters a valid LastName$")
	public void he_enters_a_valid_LastName() throws Throwable {
	    personalDetailsPage.setLastName("Kunisetty");
	    Thread.sleep(2000);
	}

	@When("^he clicks 'Next' without entering eMail$")
	public void he_clicks_Next_without_entering_eMail() throws Throwable {
		personalDetailsPage.clickNext();
		Thread.sleep(2000);
	}

	@Then("^'Please fill the Email' message must be displayed$")
	public void please_fill_the_Email_message_must_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Email";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().dismiss();
	}

	@When("^he enters a valid eMail$")
	public void he_enters_a_valid_eMail() throws Throwable {
	    personalDetailsPage.setEmail("jyothi@gmail.com");
	    Thread.sleep(2000);
	}

	@When("^he clicks 'Next' without entering Contact Number$")
	public void he_clicks_Next_without_entering_Contact_Number() throws Throwable {
		personalDetailsPage.clickNext();
		Thread.sleep(2000);
	}

	@Then("^'Please fill the Contact No' message must be displayed$")
	public void please_fill_the_Contact_No_message_must_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Contact No.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^he enters a valid contactNumber$")
	public void he_enters_a_valid_contactNumber() throws Throwable {
	    personalDetailsPage.setPhoneNumber("8341278600");
	    Thread.sleep(2000);
	}

	@When("^he clicks 'Next' without selecting Number of People$")
	public void he_clicks_Next_without_selecting_Number_of_People() throws Throwable {
		personalDetailsPage.clickNext();
		Thread.sleep(2000);
	}

	@Then("^'Please select the Number of People atteding' message must be displayed$")
	public void please_select_the_Number_of_People_atteding_message_must_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Number of people attending";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().dismiss();
	}

	@When("^he selects the Number of People atteding for the Conference$")
	public void he_selects_the_Number_of_People_atteding_for_the_Conference() throws Throwable {
	    personalDetailsPage.selectNumberOfPeople("4");
	    Thread.sleep(2000);
	}

	@When("^he clicks 'Next' without entering Building Name & Room No$")
	public void he_clicks_Next_without_entering_Building_Name_Room_No() throws Throwable {
		personalDetailsPage.clickNext();
		Thread.sleep(2000);
	}

	@Then("^'Please fill the Building Name & Room No' message must be displayed$")
	public void please_fill_the_Building_Name_Room_No_message_must_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Building & Room No";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().dismiss();
	}

	@When("^he enters Building Name & Room No$")
	public void he_enters_Building_Name_Room_No() throws Throwable {
	   personalDetailsPage.setAddress1("Manas");
	   Thread.sleep(2000);
	}

	@When("^he clicks 'Next' without entering Area Name$")
	public void he_clicks_Next_without_entering_Area_Name() throws Throwable {
		personalDetailsPage.clickNext();
		Thread.sleep(2000);
	}

	@Then("^'Please fill the Area Name' must be displayed$")
	public void please_fill_the_Area_Name_must_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Area name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().dismiss();
	}

	@When("^he enters Area Name$")
	public void he_enters_Area_Name() throws Throwable {
	    personalDetailsPage.setAddress2("Hinjewadi");
	    Thread.sleep(2000);
	}

	@When("^he clicks 'Next' without selecting a City$")
	public void he_clicks_Next_without_selecting_a_City() throws Throwable {
		personalDetailsPage.clickNext();
		Thread.sleep(2000);
	}

	@Then("^'Please select City' message must be displayed$")
	public void please_select_City_message_must_be_displayed() throws Throwable {
		String expectedMessage="Please select city";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().dismiss();
	}

	@When("^he selects a City$")
	public void he_selects_a_City() throws Throwable {
		personalDetailsPage.selectCity("Pune");
		Thread.sleep(2000);
	}

	@When("^he clicks 'Next' without selecting a State$")
	public void he_clicks_Next_without_selecting_a_State() throws Throwable {
		personalDetailsPage.clickNext();
		Thread.sleep(2000);
	}

	@Then("^'Please select State' message must be displayed$")
	public void please_select_State_message_must_be_displayed() throws Throwable {
		String expectedMessage="Please select state";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().dismiss();
	}

	@When("^he selects a State$")
	public void he_selects_a_State() throws Throwable {
	    personalDetailsPage.selectState("Maharashtra");
	    Thread.sleep(2000);
	}

	@When("^he clicks 'Next' without selecting a MemberShip$")
	public void he_clicks_Next_without_selecting_a_MemberShip() throws Throwable {
	    personalDetailsPage.clickNext();
	    Thread.sleep(2000);
	}

	@Then("^'Please select a MemberShip Status' must be displayed$")
	public void please_select_a_MemberShip_Status_must_be_displayed() throws Throwable {
		String expectedMessage="Please Select MemeberShip status";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().dismiss();
	}

	@When("^he choses his Membership$")
	public void he_choses_his_Membership() throws Throwable {
	    personalDetailsPage.setMember1000();
	}

	@When("^he clicks 'Next'$")
	public void he_clicks_Next() throws Throwable {
	   personalDetailsPage.clickNext();
	   Thread.sleep(2000);
	}

	@Then("^'Personal Details are validated' message must be displayed$")
	public void personal_Details_are_validated_message_must_be_displayed() throws Throwable {
		String expectedMessage="Personal details are validated.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().dismiss();
	}

	@Then("^he is Redirected to 'Payment Details'$")
	public void he_is_Redirected_to_Payment_Details() throws Throwable {
		paymentPage=new PaymentDetailsPage();
		PageFactory.initElements(driver, paymentPage);
	   }

	@When("^he clicks 'Make Payment' without entering Card Holder Name$")
	public void he_clicks_Make_Payment_without_entering_Card_Holder_Name() throws Throwable {
		String expected="Payment Details";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		paymentPage.clickMakePayment();
		Thread.sleep(2000);
	}

	@Then("^'Please fill the Card Holder Name' message must be displayed$")
	public void please_fill_the_Card_Holder_Name_message_must_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Card holder name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^he enters Card Holder Name$")
	public void he_enters_Card_Holder_Name() throws Throwable {
	   paymentPage.setCardHolderName("K V S Jyothirmayee");
	   Thread.sleep(2000);
	}

	@When("^he clicks 'Make Payment' without entering Debit Card Number$")
	public void he_clicks_Make_Payment_without_entering_Debit_Card_Number() throws Throwable {
		paymentPage.clickMakePayment();
		Thread.sleep(2000);
	}

	@Then("^'Please enter the Debit Card Number' message must be displayed$")
	public void please_enter_the_Debit_Card_Number_message_must_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Debit card Number";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@Then("^he enters Debit Card Number$")
	public void he_enters_Debit_Card_Number() throws Throwable {
	    paymentPage.setDebitCardNumber("1234567890");
	    Thread.sleep(2000);
	}

	@When("^he clicks 'Make Payment' without entering CVV$")
	public void he_clicks_Make_Payment_without_entering_CVV() throws Throwable {
		paymentPage.clickMakePayment();
		Thread.sleep(2000);
	}

	@Then("^'Please enter CVV' message must be displayed$")
	public void please_enter_CVV_message_must_be_displayed() throws Throwable {
		String expectedMessage="Please fill the CVV";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@Then("^he enters CVV$")
	public void he_enters_CVV() throws Throwable {
		paymentPage.setCvv("444");
		Thread.sleep(2000);
	}

	@When("^he clicks 'Make Payment' without entering Expiration Month$")
	public void he_clicks_Make_Payment_without_entering_Expiration_Month() throws Throwable {
		paymentPage.clickMakePayment();
		Thread.sleep(2000);
	}

	@Then("^'Please fill Expiration Month' message must be displayed$")
	public void please_fill_Expiration_Month_message_must_be_displayed() throws Throwable {
		String expectedMessage="Please fill expiration month";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@Then("^he enters Expiration Month$")
	public void he_enters_Expiration_Month() throws Throwable {
	    paymentPage.setMonth("08");
	    Thread.sleep(2000);
	}

	@When("^he clicks 'Make Payment' without entering Expiration Year$")
	public void he_clicks_Make_Payment_without_entering_Expiration_Year() throws Throwable {
		paymentPage.clickMakePayment();
		Thread.sleep(2000);
	}

	@Then("^'Please fill Expiration Year' message must be displayed$")
	public void please_fill_Expiration_Year_message_must_be_displayed() throws Throwable {
		String expectedMessage="Please fill the expiration year";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@Then("^he enters Expiration Year$")
	public void he_enters_Expiration_Year() throws Throwable {
	    paymentPage.setYear("2018");
	    Thread.sleep(2000);
	}

	@When("^he clicks 'Make Payment'$")
	public void he_clicks_Make_Payment() throws Throwable {
	    paymentPage.clickMakePayment();
	}

	@Then("^'Conference Room Booking Successfully Done!!!' message must be displayed$")
	public void conference_Room_Booking_Successfully_Done_message_must_be_displayed() throws Throwable {
		String expectedMessage="Conference Room Booking successfully done!!!";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}
	
}
