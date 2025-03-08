package testSaucedemo;

import org.openqa.selenium.WebDriver;

public class Navigation {
	static WebDriver driver;

    public Navigation(WebDriver driver) {
        Navigation.driver = driver;
    }

    public static void webNavigation(String url) {
        driver.get(url);
    }
}
