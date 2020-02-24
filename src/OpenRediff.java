import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenRediff {
	
	public static void main(String args[] ){
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\SeleniumBrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.rediff.com/");
		
	}

}
