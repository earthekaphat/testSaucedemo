package testSaucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSaucedemo {
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		new Navigation(driver);
		new Authentication(driver);
		new ActionFunction(driver);
        
		Navigation.webNavigation("https://www.saucedemo.com/");
		Authentication.login("standard_user","secret_sauce");
		ActionFunction.sortProduct("hilo");
		ActionFunction.addItem("add-to-cart-sauce-labs-onesie");
		ActionFunction.verifyCartItem("Sauce Labs Onesie");
		Authentication.logout();
		driver.quit();
	}
}
