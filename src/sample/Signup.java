package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("apparna");
	driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("appu");
	driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("8297189300");
	driver.findElement(By.xpath("//*[@id=\"u_0_y\"]")).sendKeys("Lovely@9294");
	WebElement testDropDown = driver.findElement(By.id("day"));  
	Select dropdown = new Select(testDropDown); 
	dropdown.selectByIndex(1);
	WebElement testDropDown2 = driver.findElement(By.id("month"));  
	Select dropdown2 = new Select(testDropDown2); 
	dropdown2.selectByIndex(5);
	WebElement testDropDown3 = driver.findElement(By.id("year"));  
	Select dropdown3 = new Select(testDropDown3); 
	dropdown3.selectByIndex(6);
	//driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();
	//Thread.sleep(3000);
	WebElement radioBtn = driver.findElement(By.xpath("//*[@id=\"u_0_11\"]/span[1]"));
	radioBtn.click();
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"u_0_15\"]")).click();
	//driver.close();
	
	
	
	
	
}
}
