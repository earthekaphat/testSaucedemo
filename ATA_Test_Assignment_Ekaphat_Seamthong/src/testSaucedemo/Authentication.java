package testSaucedemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Authentication {
	static WebDriver driver;
	
	public Authentication(WebDriver driver) {
		Authentication.driver = driver;
	}
	
	public static void login(String username,String password) {
		driver.findElement(Locators.USERNAME_INPUT).sendKeys(username);
		driver.findElement(Locators.PASSWORD_INPUT).sendKeys(password);
		driver.findElement(Locators.LOGIN_BUTTON).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
	}
	
	public static void logout() {
		driver.findElement(Locators.MENU_BUTTON).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(Locators.LOGOUT_LINK).click();
	}
}
