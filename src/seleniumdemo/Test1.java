package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		
		// webdriver.chrome.driver - chrome
		// webdriver.gecko.driver - mozilla
		// webdriver.edge.driver - edge
		// webdriver.ie.driver - ie
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Vaibhav\\git\\jun23_selenium_1\\drivers\\chrome\\116\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// when ever new browser is opening, fresh session will start
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.close(); //  kill the active tab
		driver.quit(); // kill the entire session
		
	}
}
