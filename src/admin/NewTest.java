package admin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	private static WebDriver driver;
	@Test(priority=1)
	 public void f() throws InterruptedException {
	  
	 

		driver.get("https://phptravels.net/admin/login.php");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@phptravel.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("demoadmin");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
			Thread.sleep(2000);}
		@Test(priority=2)
		 public void f1() throws InterruptedException {
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@phptravels.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("demo");
			driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(2000);}
		@Test(priority=3)
		 public void f2() throws InterruptedException {
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@phptravels.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("demoadmin");
			driver.findElement(By.xpath("//button[@id='submit']")).click();
			Thread.sleep(1500);
		  }
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\Arya\\Celenium\\Chrome new1\\chromedriver.exe");
	  driver=new ChromeDriver(); 
		
		
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
