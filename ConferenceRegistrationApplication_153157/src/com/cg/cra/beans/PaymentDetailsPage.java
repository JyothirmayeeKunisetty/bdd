package com.cg.cra.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentDetailsPage {

	@FindBy(name="txtFN")
	private WebElement cardHolderName;
	
	@FindBy(name="debit")
	private WebElement debitCardNumber;
	
	@FindBy(name="cvv")
	private WebElement cvv;
	
	@FindBy(name="month")
	private WebElement month;
	
	@FindBy(name="year")
	private WebElement year;
	
	@FindBy(id="btnPayment")
	private WebElement makePayment;

	public PaymentDetailsPage() {}

	public String getCardHolderName() {
		return this.cardHolderName.getAttribute("value");
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName.sendKeys(cardHolderName);
	}

	public String getDebitCardNumber() {
		return this.debitCardNumber.getAttribute("value");
	}

	public void setDebitCardNumber(String debitCardNumber) {
		this.debitCardNumber.sendKeys(debitCardNumber);
	}

	public String getCvv() {
		return this.cvv.getAttribute("value");
	}

	public void setCvv(String cvv) {
		this.cvv.sendKeys(cvv);
	}

	public String getMonth() {
		return this.month.getAttribute("value");
	}

	public void setMonth(String month) {
		this.month.sendKeys(month);
	}

	public String getYear() {
		return this.year.getAttribute("value");
	}

	public void setYear(String year) {
		this.year.sendKeys(year);
	}

	public void clickMakePayment() {
		makePayment.click();
	}
	
}
