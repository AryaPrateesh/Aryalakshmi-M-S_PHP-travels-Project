package customer;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTestphpcustbooking {
	private static WebDriver driver;
  @Test(priority=1)
  public void f() throws InterruptedException {
  driver.get("https://phptravels.net/login/");
	driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
	driver.findElement(By.name("password")).sendKeys("demouser");
	driver.findElement(By.xpath("/html/body/div[1]/form/div/div/div/div[4]/div[1]/button")).click();
	Thread.sleep(1500);}
  @Test(priority=2)
  public void f1() throws InterruptedException {
  driver.findElement(By.xpath("/html/body/header/div/div[2]/div[2]/ul/li[3]/a/strong")).click();
  driver.findElement(By.xpath("  /html/body/header/div/div[2]/div[2]/ul/li[3]/ul/li[1]/a")).click();

	System.out.println("Dashboard");
	Thread.sleep(1500);}
  @Test(priority=3)
  public void f2() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/header/div/div[2]/div[2]/ul/li[3]/a/strong")).click();
  driver.findElement(By.xpath("/html/body/header/div/div[2]/div[2]/ul/li[3]/ul/li[2]/a")).click();
	System.out.println("My Booking");
	Thread.sleep(1500);}
  @Test(priority=4)
  public void f3() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/header/div/div[2]/div[2]/ul/li[3]/a/strong")).click();
		driver.findElement(By.xpath("/html/body/header/div/div[2]/div[2]/ul/li[3]/ul/li[3]/a")).click();
		System.out.println("Wallet");
		Thread.sleep(1500);}
  @Test(priority=5)
  public void f4() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/header/div/div[2]/div[2]/ul/li[3]/a/strong")).click();
		driver.findElement(By.xpath("/html/body/header/div/div[2]/div[2]/ul/li[3]/ul/li[4]/a")).click();
		System.out.println("My Profile");
		Thread.sleep(1000);}
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\Arya\\Celenium\\Chrome new1\\chromedriver.exe");
	  driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.findElement(By.xpath("/html/body/header/div/div[2]/div[2]/ul/li[3]/a/strong")).click();
	  driver.findElement(By.xpath("/html/body/header/div/div[2]/div[2]/ul/li[3]/ul/li[6]/a")).click();
  }

}
