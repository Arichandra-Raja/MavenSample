//package stepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Step_Login {
//	SoftAssert softAssert = new SoftAssert();
//	
//	@Test (priority = 0)
//	public void googleLaunch() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.co.in/");
//		
//		String expectedTitle = "Googl";
//		
//		String actualTitle = driver.getTitle();
//		
//		softAssert.assertEquals(actualTitle, expectedTitle, "Assert is passed");
//		driver.findElement(By.id("APjFqb")).sendKeys("Mobile");
//		softAssert.assertAll();
//		
//	}
//	@Test (priority = 1)
//	public void bingLaunch() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.bing.com/");
//		
//
//	
//	
//	
//	
//	}
//	
//	
//	
//	
//}
