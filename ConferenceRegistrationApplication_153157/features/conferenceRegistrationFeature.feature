Feature: Conference Registration Feature
User wants to register for a Conference using his Personal Details and Payment Procedure

Scenario: User wants to register for a conference
	Given User opens 'ConferenceRegistration' page
	When he clicks 'Next' without entering FirstName
	Then 'Please fill the First Name' message must be displayed
	
	When he enters a valid FirstName
	And he clicks 'Next' without entering LastName
	Then 'Please fill the Last Name' message must be displayed
	
	When he enters a valid LastName
	And he clicks 'Next' without entering eMail
	Then 'Please fill the Email' message must be displayed
	
	When he enters a valid eMail
	And he clicks 'Next' without entering Contact Number
	Then 'Please fill the Contact No' message must be displayed
	
	When he enters a valid contactNumber
	And he clicks 'Next' without selecting Number of People 
	Then 'Please select the Number of People atteding' message must be displayed 
	
	When he selects the Number of People atteding for the Conference
	And he clicks 'Next' without entering Building Name & Room No
	Then 'Please fill the Building Name & Room No' message must be displayed
	
	When he enters Building Name & Room No
	And he clicks 'Next' without entering Area Name
	Then 'Please fill the Area Name' must be displayed
	
	When he enters Area Name
	And he clicks 'Next' without selecting a City
	Then 'Please select City' message must be displayed
	
	When he selects a City
	And he clicks 'Next' without selecting a State
	Then 'Please select State' message must be displayed
	 
	When he selects a State
	And he clicks 'Next' without selecting a MemberShip
	Then 'Please select a MemberShip Status' must be displayed 
	
	When he choses his Membership
	And he clicks 'Next'
	Then 'Personal Details are validated' message must be displayed
	
	And he is Redirected to 'Payment Details'
	When he clicks 'Make Payment' without entering Card Holder Name
	Then 'Please fill the Card Holder Name' message must be displayed
	
	When he enters Card Holder Name
	When he clicks 'Make Payment' without entering Debit Card Number
	Then 'Please enter the Debit Card Number' message must be displayed
	
	And he enters Debit Card Number
	When he clicks 'Make Payment' without entering CVV
	Then 'Please enter CVV' message must be displayed
	
	And he enters CVV
	When he clicks 'Make Payment' without entering Expiration Month
	Then 'Please fill Expiration Month' message must be displayed
	
	And he enters Expiration Month
	When he clicks 'Make Payment' without entering Expiration Year
	Then 'Please fill Expiration Year' message must be displayed
	
	And he enters Expiration Year
	When he clicks 'Make Payment'
	Then 'Conference Room Booking Successfully Done!!!' message must be displayed