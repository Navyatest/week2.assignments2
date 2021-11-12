package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
	    Point location = driver.findElement(By.id("position")).getLocation();
	    System.out.println(location);
	    String cssValue = driver.findElement(By.xpath("//button[text()='What color am I?']")).getCssValue("background-color");
	    System.out.println(cssValue);
	    Dimension size = driver.findElement(By.xpath("//button[text()='What is my size?']")).getSize();
	    System.out.println(size);
	    
	     
	
	
	}

}
