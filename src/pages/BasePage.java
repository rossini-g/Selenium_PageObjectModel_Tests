package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import support.Engine;

/**
 * @author Rossini Higgins
 *
 */
public class BasePage extends Engine {
	
	protected String url;
	protected WebDriver driver;
	FluentWait<WebDriver> wait;
	
	@SuppressWarnings("deprecation")
	public BasePage(WebDriver webDriver) {
		this.driver = webDriver;
		this.wait = new FluentWait<WebDriver>(driver)
				.withTimeout(implicitWait, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(Exception.class);
	}
	
	protected void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.build().perform();
	}
	
	protected void moveToElement(By by) {
		moveToElement(driver.findElement(by));
	}
	
	public void scrollToBottom() {
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	protected WebElement scrollToElement(WebElement element) {
		((JavascriptExecutor) driver).executeScript(
	            "arguments[0].scrollIntoView(true); window.scrollBy(0, -150);", element);
		return element;
	}
	
	protected WebElement scrollToElement(By by) {
		return scrollToElement(driver.findElement(by));
	}
	
	protected WebElement findElement(By by, boolean waitToBeClickable) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(waitToBeClickable)
			return wait.until(
					ExpectedConditions.elementToBeClickable(this.driver.findElement(by)));
		else
			return wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(by)));
	}
	
	protected WebElement findElement(By by) {
		return findElement(by, false);
	}
	
	
	
}
