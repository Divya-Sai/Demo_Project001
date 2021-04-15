package demo001.demoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Democlass {
	
	public WebDriver driver;
	
	@org.testng.annotations.Test
	@org.testng.annotations.Parameters("br")
	public void setUp(String br) {
		if(br.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		else if (br.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://www.google.com/");
		}
	}

}
