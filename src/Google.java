import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\SeleniumBrowserDrivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}

}
