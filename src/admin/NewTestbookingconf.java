package admin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTestbookingconf {
	private static WebDriver driver;
	String originalWindow;
	WebDriverWait wait;
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
  	//driver.switchTo().alert().accept();
  	//driver.switchTo().alert().accept();
		Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/main/section/div[2]/div/div[1]/form/div[2]/div/select/option[2]")).click();
	//driver.switchTo().alert().accept();
  Thread.sleep(1500);}
  @Test(priority=2)
	 public void f2() throws InterruptedException {
	  Thread.sleep(1500);
	driver.findElement(By.xpath("/html/body/main/section/div[2]/div/div[1]/form/div[3]/div/select/option[2]")).click();
	//driver.findElement(By.cssSelector("select[name='module'] option[value='hotels']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("/html/body/main/section/div[2]/div/div[1]/form/div[4]/div/select/option[3]")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("/html/body/main/section/div[2]/div/div[1]/form/div[6]/button")).click();
	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().accept();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/main/section/div[2]/div/div[2]/figure/blockquote[2]/div/span/a")).click();
	//driver.switchTo().alert().accept();
	
	Thread.sleep(500);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]/input[2]")).click();
	//Thread.sleep(500);
	
	wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	
  }
  @Test(priority=3)
	 public void f3() throws InterruptedException {	  
	  String newWindow = null;
	  Set<String> handles =  driver.getWindowHandles();
	  for (String windowHandle : handles) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		    	newWindow = windowHandle;
		        driver.switchTo().window(windowHandle);
		        wait.until(ExpectedConditions.titleIs("Hotels Invoice"));
		     // Find an element within the frame and perform an action
		  	  WebElement elementInFrame = driver.findElement(By.id("form_gateway"));
		  	  elementInFrame.submit();
		        break;
		    }
		}
	  //wait.until(ExpectedConditions.titleIs("Hotels Invoice"));
	  //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(newWindow));
	  System.out.println(newWindow);
	  
	

	// Switch back to the main content (outside the frame)
	  driver.switchTo().defaultContent();
	Thread.sleep(500);
	
	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\Arya\\Celenium\\Chrome new1\\chromedriver.exe");
	  driver=new ChromeDriver(); 
	  originalWindow = driver.getWindowHandle();
	  assert driver.getWindowHandles().size() == 1;
	  wait = new WebDriverWait(driver, 1);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	
		  driver.quit();
  }

}
