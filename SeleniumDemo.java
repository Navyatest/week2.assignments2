package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// OPEN THE BROWSER
		 ChromeDriver driver=new ChromeDriver();
		// LOAD THE URL
		 driver.get("http://leaftaps.com/opentaps/control/main");
		// MAXIMIZE THE BROWSER
		 driver.manage().window().maximize();
		// ENTER USERNAME DemoSalesManager
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// ENTER PASSWORD crmsfa
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		// TO CLICK LOGIN
		 driver.findElement(By.className("decorativeSubmit")).click();
		 // CLICK CRM/SFA
		 driver.findElement(By.linkText("CRM/SFA")).click();
		// CLICK CONTACTS TAB
		 driver.findElement(By.linkText("Contacts")).click();
		 // TO CLICK FIND CONTACTS
		 driver.findElement(By.linkText("Find Contacts")).click();
		 // TO CLICK EMAIL
		 driver.findElement(By.linkText("Email")).click();
		 // ENTER EMAIL AS babu@testlesf.com
		 driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		 // TO CLICK FIND CONTACTS
		 driver.findElement(By.linkText("Find Contacts")).click();
		 // TO CLOSE THE DRIVER
		 driver.close();
		 

	}

}
