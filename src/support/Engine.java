package support;

import org.openqa.selenium.WebDriver;

import support.Configurations;

/**
 * @author Rossini Higgins
 *
 */
public class Engine {
	
	public Configurations cproperty = new Configurations(
			"config.properties");
	protected WebDriver driver;
	public String browser = cproperty.getProperty("browserType");
	public String URL = cproperty.getProperty("URL");
	public int implicitWait = Integer.valueOf(cproperty.getProperty("ImplicitWait"));

}
