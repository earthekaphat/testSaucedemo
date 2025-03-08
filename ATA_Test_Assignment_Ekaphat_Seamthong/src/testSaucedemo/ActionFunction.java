package testSaucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ActionFunction {
	static WebDriver driver;
	
	public ActionFunction(WebDriver driver) {
		ActionFunction.driver = driver;
	}
	
	public static void sortProduct(String sortType) {
		driver.findElement(Locators.PRODUCT_SORT_DROPDOWN).click();
		Select dropdown = new Select(driver.findElement(Locators.PRODUCT_SORT_DROPDOWN));
		dropdown.selectByValue(sortType);
	}
	
	public static void addItem(String item) {
		driver.findElement(Locators.addItemToCart(item)).click();
	}
	
	public static void verifyCartItem(String item) {
		driver.findElement(Locators.SHOPPING_CART_LINK).click();
		Assert.assertEquals(driver.findElement(Locators.CART_ITEM_COUNT).getText(), "1");
		Assert.assertEquals(driver.findElement(Locators.INVENTORY_ITEM_NAME).getText(), item);
	}
}
