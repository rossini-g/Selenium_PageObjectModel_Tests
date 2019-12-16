package pages;

import org.openqa.selenium.By;

public class HomePageSelectors {
	
	By headingUI = By.cssSelector("h1.ui-reveal");
	By phoneNumberText = 
			By.xpath("//*[text()='Contact Us']/ancestor::div[@class='head']/following-sibling::ul//span");
	By emailText = 
			By.xpath("//*[text()='Contact Us']/ancestor::div[@class='head']/following-sibling::ul//a");
	By addressText = 
			By.xpath("//*[text()='Find Us']/ancestor::div[@class='head']/following-sibling::ul//span");
	By membershipOptionsLink = 
			By.xpath("//*[contains(text(),'Membership Options')]");
	By coreMembershipLink = 
			By.xpath("//*[contains(text(),'CORE MEMBERSHIP')]");

}
