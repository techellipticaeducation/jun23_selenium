package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
	public static void main(String[] args) {

		// webdriver.chrome.driver - chrome
		// webdriver.gecko.driver - mozilla
		// webdriver.edge.driver - edge
		// webdriver.ie.driver - ie

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Vaibhav\\git\\jun23_selenium_1\\drivers\\chrome\\116\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// when ever new browser is opening, fresh session will start
		driver.get("https://www.saucedemo.com/");

		// Selenium provide 8 Types
		// 1 - id
		// 2 - name
		// 3 - class
		// 4 - tag name
		//		5 - linktext

		// Locating your elements
		// Step 1 - Enter username in username block
		//		sendKeys = Keyboard simulation

		WebElement usernameblock = driver.findElement(By.id("user-name"));
		usernameblock.sendKeys("standard_user");

		// Step 2 - ENter password with password block
		WebElement passwordBlock = driver.findElement(By.id("password"));
		passwordBlock.sendKeys("secret_sauce");

		// Step 3 - click on Login button
		WebElement loginBtnElement = driver.findElement(By.id("login-button"));
		loginBtnElement.click();

		// Handle dropdown in selenium
		Select sel = new Select(driver.findElement(By.className("product_sort_container")));
//		sel.selectByIndex(2);
//		sel.selectByValue("hilo");
		sel.selectByVisibleText("Price (low to high)");
		
		
		
//		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
//		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//		WebElement badgeCountElement = driver.findElement(By.className("shopping_cart_badge"));
//		String count = badgeCountElement.getText();
//		System.out.println(count);
		

				driver.close(); //  kill the active tab
				driver.quit(); // kill the entire session

	}
}
