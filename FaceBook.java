package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// OPEN THE BROWSER
		 ChromeDriver driver=new ChromeDriver();
		// LOAD THE URL
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//ADD IMPLICIT WAIT
		 Thread.sleep(5000);
		 
		 driver.findElement(By.linkText("Create New Account")).click();
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Harish");    
		 driver.findElement(By.name("lastname")).sendKeys("Roy");
		
		 driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following::input")).sendKeys("n@gmail.com");
		 driver.findElement(By.xpath("//div[text()='New password']/following::input")).sendKeys("123452@12");
		 WebElement day = driver.findElement(By.id("day"));
		 Select choose = new Select(day);
		 choose.selectByValue("6");
		 WebElement mon = driver.findElement(By.id("month"));
		 Select choose1 = new Select(mon);
		 choose1.selectByValue("6");
		 WebElement year = driver.findElement(By.id("year"));
		 Select choose2 = new Select(year);
		 choose2.selectByValue("1994");
		 driver.findElement(By.xpath("//label[text()='Female']")).click();
		 
		 
		 

	}

}
