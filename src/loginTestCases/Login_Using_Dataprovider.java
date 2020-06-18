package loginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_Using_Dataprovider {
	
	String [] [] data= {
			{"Admin","admin123"},
			{"Admin1","admin223"},
			{"Admin12","admin123"},
			{"Admin","admin1123"},
	};
	@DataProvider(name="login data")
	public  String [] []  loginDataProvider() {
		return data;
		
	}

	@Test(dataProvider="login data")
	public void loginWithCorrectUserName(String uName, String pWord) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys(uName);

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(pWord);

		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();
		Thread.sleep(2000);
		driver.quit();
	}


}
