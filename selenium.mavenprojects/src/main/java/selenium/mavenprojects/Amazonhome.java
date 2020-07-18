package selenium.mavenprojects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonhome {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JaJa\\eclipse-workspace\\selenium.mavenprojects\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
				String url = "https:\\www.amazon.com";
		driver.get(url);
		
		driver.quit();
}
}