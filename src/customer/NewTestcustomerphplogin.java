package customer;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTestcustomerphplogin {
private static WebDriver driver;
  @Test(priority=1)
  public void f() throws InterruptedException {

		driver.get("https://phptravels.net/login/");
		driver.findElement(By.name("email")).sendKeys("user@phptravel.com");
		driver.findElement(By.name("password")).sendKeys("demouser");
		driver.findElement(By.xpath("/html/body/div[1]/form/div/div/div/div[4]/div[1]/button")).click();
		Thread.sleep(1500);}
	@Test(priority=2)
	 public void f1() throws InterruptedException {
	driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
	driver.findElement(By.name("password")).sendKeys("demo");
	driver.findElement(By.xpath("/html/body/div[1]/form/div/div/div/div[4]/div[1]/button")).click();
	Thread.sleep(1500);}
	@Test(priority=3)
	 public void f2() throws InterruptedException {
	driver.findElement(By.name("email")).sendKeys("");
	driver.findElement(By.name("password")).sendKeys("");
	driver.findElement(By.xpath("/html/body/div[1]/form/div/div/div/div[4]/div[1]/button")).click();
	Thread.sleep(1500);}
		
@Test(priority=4)
public void f3() throws InterruptedException {
	driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
	driver.findElement(By.name("password")).sendKeys("demouser");
	driver.findElement(By.xpath("/html/body/div[1]/form/div/div/div/div[4]/div[1]/button")).click();
	Thread.sleep(500);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\Arya\\Celenium\\Chrome new1\\chromedriver.exe");
	  driver=new ChromeDriver(); 
  }
  

  @AfterTest
  public void afterTest() { 
		  driver.quit();
  }

}
