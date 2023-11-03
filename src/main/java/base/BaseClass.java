package base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	protected WebDriver driver;
	
	
	public void getBrowser() throws IOException {
	
		File filePath = new File("C:\\Users\\arich\\eclipse-workspace\\Maven_Weekend\\src\\test\\resources\\Properties\\config.properties");
		FileReader fR = new FileReader(filePath);
		Properties prop = new Properties();
		prop.load(fR);
		
	
		if (prop.getProperty("browse").equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
			driver.manage().window().maximize();
            driver.get(prop.getProperty("testurl"));
			
		}
		else if (prop.getProperty("browse").equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("testUrl"));
			
			
		}
			
		

			
			
		}

	}


