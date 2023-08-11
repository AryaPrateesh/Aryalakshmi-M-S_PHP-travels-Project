package customer;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTestphpcustaddfund {
	private static WebDriver driver;
	WebDriverWait wait;
	
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
	  driver.findElement(By.xpath("/html/body/header/div/div[2]/div[2]/ul/li[3]/ul/li[4]/a")).click();
		System.out.println("My Profile");
	Thread.sleep(1500);}
  @Test(priority=3)
  public void f2() throws InterruptedException {	
	  driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[1]/div[2]/ul/li[3]")).click(); //Profile click
	WebElement country_txt=driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[3]/div[2]/div/div"));
	country_txt.click();
	System.out.println("in dropdown text");
	WebElement password=driver.findElement(By.id("Password"));
	password.clear();
	password.sendKeys("demouser");

	WebElement country_code=driver.findElement(By.xpath("//*[@id=\"bs-select-1-99\"]"));
	country_code.click();
//	action.moveToElement(country_name);
	
	WebElement phone=driver.findElement(By.id("Phone"));
	phone.clear();
	phone.sendKeys("251365448996");
	Thread.sleep(2000);
	
	WebElement country=driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[4]/div[1]/div/div/button"));
	country.click();
	WebElement country_name=driver.findElement(By.xpath("//*[@id=\"bs-select-2-99\"]"));
	country_name.click();
	
	WebElement state=driver.findElement(By.id("State"));
	state.clear();
	state.sendKeys("Kerala");
	WebElement city=driver.findElement(By.id("City"));
	city.clear();
	city.sendKeys("Kochi");
	  
      String address1 = "New York";
      String address2 = "123 Main Street";
	  WebElement address1Field = driver.findElement(By.name("address1"));
	  address1Field.clear();
	  address1Field.sendKeys(address1);
    
      WebElement address2Field = driver.findElement(By.name("address2"));
      address2Field.clear();
      address2Field.sendKeys(address2);
      Thread.sleep(1500);
	  WebElement update_profile=driver.findElement(By.id("profile"));
	  wait.until(ExpectedConditions.elementToBeClickable(update_profile));
	  	System.out.println(update_profile.toString());
		update_profile.submit();
		System.out.println("Profile Updated");
		Thread.sleep(1500);}
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\Arya\\Celenium\\Chrome new1\\chromedriver.exe");
	  driver=new ChromeDriver();
	  wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
