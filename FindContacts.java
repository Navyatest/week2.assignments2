package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContacts {

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
		 //TYPE THE FIRST NAME
		 driver.findElement(By.xpath("//label[text()='Contact Id:']/following::input[@name='firstName']")).sendKeys("babu");
		 driver.findElement(By.xpath("//label[text()='Contact Id:']/following::button[text()='find Contact']")).click();
		 //click on find contacts 
		 driver.findElement(By.xpath("//a[@href='/crmsfa/control/findContacts']")).click();
		 //to get first contact and print id
		String contactid = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]")).getText();
		System.out.println(contactid);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]")).click();
		
	
		 

	}

}
