package loginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Both_Correct {
	@Test
	@Parameters({"username", "password"})
	public void loginWithBoth_InCorrect(String uName, String pWord) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys(uName);
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(pWord);
		
		WebElement loginButton=driver.findElement(By.id("btnLogin"));
		loginButton.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
