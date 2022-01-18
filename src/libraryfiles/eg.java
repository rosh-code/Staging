package libraryfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("WebDriver.ChromeDriver", "C:\\Users\\roshna mittu\\Downloads\\seleniumcd/chromedriver.exe");
		driver.get("http:seleniumhq.org");

	}

}
