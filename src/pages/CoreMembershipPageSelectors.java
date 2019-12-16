package pages;

import org.openqa.selenium.By;

public class CoreMembershipPageSelectors{
	
	By firstNameInput = By.cssSelector("input#FirstName-clone");
	By lastNameInput = By.cssSelector("input#LastName-clone");
	
	By continueButton = 
			By.xpath("//a[contains(text(),' CONTINUE')]");
	By learnTodayText = 
			By.xpath("//*[contains(text(),'Learn more today')]");
	By becomeWheelsUpMemberHeading = 
			By.xpath("//*[contains(text(),'Becoming a Wheels Up Core Member is easy')]");
	
}
