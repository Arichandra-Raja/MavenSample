package stepDefinitions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesDemo{
	
	WebDriver driver;
	Properties prop;
	
	@BeforeTest
	public void getBrowser() throws IOException {
		
		File filePath = new File("C:\\Users\\arich\\eclipse-workspace\\Maven_Weekend\\src\\test\\resources\\Properties\\config.properties");
		FileReader fR = new FileReader(filePath);
		prop = new Properties();
		prop.load(fR);
		
	
		if (prop.getProperty("browse").equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
			driver.manage().window().maximize();
            driver.get(prop.getProperty("testUrl"));
			
		}
		else if (prop.getProperty("browse").equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("testUrl"));
			
			
		}
				
		}
	
	@Test
	public void titleGet() {
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Dashboard";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
	}
	
	
	

}
