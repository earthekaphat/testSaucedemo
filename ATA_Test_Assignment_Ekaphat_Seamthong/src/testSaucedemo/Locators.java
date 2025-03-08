package testSaucedemo;

import org.openqa.selenium.By;

public class Locators {
    public static final By USERNAME_INPUT = By.name("user-name");
    public static final By PASSWORD_INPUT = By.name("password");
    public static final By LOGIN_BUTTON = By.name("login-button");
    public static final By PRODUCT_SORT_DROPDOWN = By.className("product_sort_container");
    public static final By ITEM = By.name("item");
    public static final By SHOPPING_CART_LINK = By.className("shopping_cart_link");
    public static final By INVENTORY_ITEM_NAME = By.className("inventory_item_name");
    public static final By CART_ITEM_COUNT = By.xpath("//*[@id='cart_contents_container']/div/div[1]/div[3]/div[1]");
    public static final By MENU_BUTTON = By.id("react-burger-menu-btn");
    public static final By LOGOUT_LINK = By.cssSelector("a#logout_sidebar_link");
    public static By addItemToCart(String item) {
        return By.name(item);
    }
}