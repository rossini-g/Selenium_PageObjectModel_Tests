package pages;

import org.openqa.selenium.By;

public class RequestInfoPageSelectors {
	
	By heading = By.xpath("//h1[contains(text(),'learn')]");
	By xButton = 
			By.cssSelector(".show .close");
	By emailInput = 
			By.cssSelector(".field[id^='Email']");
	By phoneNumberInput = 
			By.cssSelector(".field[id^='Phone']");
	By companyNameInput = 
			By.cssSelector(".field[id^='Company']");
	By streetAddressInput = 
			By.cssSelector(".field[id^='Address']");
	By cityInput = 
			By.cssSelector(".field[id^='City']");
	By zipCodeInput = 
			By.cssSelector(".field[id^='PostalCode']");
	By stateInput = 
			By.cssSelector(".field[id^='State']");
	By countryInput = 
			By.cssSelector(".field[id^='Country']");
	
	By numFlightsDropDown = 
			By.cssSelector("[id^='How_Many_Private_Flights'] .dropdown-field");
	By numFlights10plus = 
			By.xpath("//*[contains(@id,'How_Many_Private_Flights')]//li/*[text()='10+']");
	
	By petsYesRadioButton = 
			By.cssSelector("[id*='pet'] input[name*='pet'][value='Yes']+*");
	
	By secondHomeDropDown = 
			By.cssSelector("[id*='second_home'] .dropdown-field");
	By secondHomeYes = 
			By.xpath("//*[contains(@id,'second_home')]//li/*[text()='Yes']");
	
	By leadTravelByCharterCheckbox = 
			By.cssSelector("[id*='currently_Travel'] [name*='currently_Travel'][value='Charter']+*");
	
	By interestCoreCheckbox = 
			By.cssSelector("[id*='Interest'] [value*='Core']+*");
	
	By leadSourceDropdown = 
			By.cssSelector("[id^='lead'] .dropdown-field");
	By leadSourceAdvertisement = 
			By.xpath("//*[contains(@id,'lead')]//li/*[text()='Advertisement']");
	
}
