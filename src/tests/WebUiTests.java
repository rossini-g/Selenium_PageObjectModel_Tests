package tests;

import org.testng.annotations.*;

import pages.CoreMembershipPage;
import pages.HomePage;
import pages.RequestInfoPage;

/**
 * @author Rossini Higgins
 *
 */
public class WebUiTests extends TestBase {

	@Test(groups = { "T1" })
    public void test1() {
        System.out.println("Wheels Up Exercise 2");
        
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        System.out.println(homePage.getHeading());
        homePage.scrollToBottom();
        System.out.println(homePage.getPhoneNumber());
        System.out.println(homePage.getEmail());
        System.out.println(homePage.getAddress());
        
        CoreMembershipPage cmPage = homePage.clickCorekMembershipOptions();
        cmPage.scrollToBecomingAMember();
        System.out.println("ONE-TIME INITIATION FEE");
        cmPage.scrollToLearnMoreToday();
        
        cmPage.inputFirstName("Ross");
        cmPage.inputLastName("Higgins");
        RequestInfoPage riPage = cmPage.clickContinue();
        
        riPage.fillOutForm();
        riPage.clickXButton();

    }
}
