import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenYahoo {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumBrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/");
	}

}
