package phpagent;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTestphphotelsearch {
	  private static WebDriver driver;
	
  @Test(priority=1)
  public void f() throws InterruptedException {
	  
		driver.get("https://phptravels.net/login/");
		driver.findElement(By.name("email")).sendKeys("agent@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demoagent");
		driver.findElement(By.xpath("/html/body/div[1]/form/div/div/div/div[4]/div[1]/button")).click();
		Thread.sleep(1500);}
		@Test(priority=2)
		 public void f1() throws InterruptedException {
			driver.findElement(By.xpath("/html/body/header/div/div[2]/div[1]/ul/li[2]/a")).click();
			
			Thread.sleep(1500);}
@Test(priority=3)
public void f2() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/section[1]/section/div/div/div/form/div/div[1]/div[1]/span/span[1]/span/span[1]")).click();
	
	driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/div/div[1]/div/strong/small")).click();
	
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    driver.findElement(By.xpath("/html/body/header/div/div[2]/div[2]/ul/li[2]/a/strong")).click();
	Thread.sleep(2000);
}
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\Arya\\Celenium\\Chrome new1\\chromedriver.exe");
	  driver=new ChromeDriver(); 
  }

  @AfterTest
  public void afterTest() {
	  driver.findElement(By.xpath("/html/body/header/div/div[2]/div[2]/ul/li[2]/ul/li[4]/a/span[1]/strong")).click();  
  }

}
