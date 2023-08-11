package admin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTestbooking {
	private static WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://phptravels.net/admin/login.php");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@phptravels.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("demoadmin");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	  	Thread.sleep(1500);
	
  }
  @Test(priority=1)
  public void f1() throws InterruptedException {
  	driver.findElement(By.xpath("/html/body/main/header/ul/li[9]/a")).click();
		Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/main/section/div[2]/div/div[1]/form/div[2]/div/select/option[2]")).click();
  Thread.sleep(1500);}
  @Test(priority=2)
	 public void f2() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/main/section/div[2]/div/div[1]/form/div[3]/div/select/option[3]")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("/html/body/main/section/div[2]/div/div[1]/form/div[4]/div/select/option[2]")).click();
	driver.findElement(By.xpath("/html/body/main/section/div[2]/div/div[1]/form/div[6]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/main/section/div[2]/div/div[2]/figure/blockquote[2]/div/span/a")).click();
	Thread.sleep(6000);
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
