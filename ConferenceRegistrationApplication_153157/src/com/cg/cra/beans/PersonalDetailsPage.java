package com.cg.cra.beans;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.*;

public class PersonalDetailsPage {

	@FindBy(how=How.ID,id="txtFirstName")
	private WebElement firstName;
	
	@FindBy(how=How.ID,id="txtLastName")
	private WebElement lastName;
	
	@FindBy(how=How.ID,id="txtEmail")
	private WebElement eMail;
	
	@FindBy(how=How.ID,id="txtPhone")
	private WebElement phoneNumber;
	
	@FindBy(how=How.NAME,name="size")
	private WebElement numberOfPeople;
	
	@FindBy(how=How.ID,id="txtAddress1")
	private WebElement address1;
	
	@FindBy(how=How.ID,id="txtAddress2")
	private WebElement address2;
	
	@FindBy(name="city")
	private WebElement city;
	
	@FindBy(name="state")
	private WebElement state;
	
	@FindBy(how=How.XPATH,xpath="/html/body/form/table/tbody/tr[12]/td[2]/input")
	private WebElement member1000;
	
	@FindBy(how=How.XPATH,xpath="/html/body/form/table/tbody/tr[13]/td[2]/input")
	private WebElement nonMember1500;
	
	@FindBy(how=How.XPATH,xpath="/html/body/form/table/tbody/tr[14]/td/a")
	private WebElement clickNext;
	
	
	public PersonalDetailsPage() {}
	
	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	
	public String getFirstName() {
		return this.firstName.getAttribute("value");
	}
	
	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	
	public String getLastName() {
		return this.lastName.getAttribute("value");
	}
	
	public void setEmail(String eMail) {
		this.eMail.sendKeys(eMail);
	}
	
	public String getEmail() {
		return this.eMail.getAttribute("value");
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber.sendKeys(phoneNumber);
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber.getAttribute("value");
	}
	
	public void selectNumberOfPeople(String number) {
		Select select=new Select(numberOfPeople);
		select.selectByVisibleText(number);
	}
	
	public void setAddress1(String address1) {
		this.address1.sendKeys(address1);
	}
	
	public String getAddress1() {
		return this.address1.getAttribute("value");
	}
	
	public void setAddress2(String address2) {
		this.address2.sendKeys(address2);
	}
	
	public String getAddress2() {
		return this.address2.getAttribute("value");
	}
	
	public void selectCity(String selectedCity) {
		Select select=new Select(city);
		select.selectByVisibleText(selectedCity);
	}
	
	public void selectState(String selectedState) {
		Select select=new Select(state);
		select.selectByVisibleText(selectedState);
	}
	
	public void setMember1000() {
		this.member1000.click();
	}

	public void setNonMember1500() {
		this.nonMember1500.click();
	}
	
	public void clickNext() {
		clickNext.click();
	}
}
