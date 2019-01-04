package BaseOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Learn {
	
	static FoundElement foundElement_Obj = new FoundElement();

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hossain Sakhaout\\Documents\\Selenium\\Driver\\chromedriver.exe");
	String titale;
	WebDriver driver = new ChromeDriver();
	driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");
	titale = driver.getCurrentUrl();
	System.out.println("Titale:  "+titale);
	//foundElement_Obj.contuctModule();
	//driver.get(foundElement_Obj.toString());
	

	}

}
