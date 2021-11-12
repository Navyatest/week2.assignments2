package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// OPEN THE BROWSER
		 ChromeDriver driver=new ChromeDriver();
		// LOAD THE URL
		 driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		 driver.manage().window().maximize();
		 //ADD IMPLICIT WAIT
		 Thread.sleep(5000);
		 //TO FILL THE TEXT BOXES
		 driver.findElement(By.name("UserFirstName")).sendKeys("Navya");
		 driver.findElement(By.name("UserLastName")).sendKeys("Vinay");
		 driver.findElement(By.name("UserEmail")).sendKeys("navya@gmail.com");
		 //TO CLICK ON DROPDOWN
		 WebElement jobtitle = driver.findElement(By.name("UserTitle"));
		 Select select = new Select(jobtitle);
		 select.selectByVisibleText("Developer / Software Engineer / Analyst");
		 driver.findElement(By.name("CompanyName")).sendKeys("wipro");
		 WebElement employees = driver.findElement(By.name("CompanyEmployees"));
		 Select select1 = new Select(employees);
		 select1.selectByVisibleText("501 - 1500 employees");
		 driver.findElement(By.name("UserPhone")).sendKeys("954712865");
		// WebElement country = driver.findElement(By.name("CompanyCountry"));
		 //Select select2 = new Select(country);
		 //select2.selectByValue("IN");
		 //TO CLICK THE CHECK BOX
		 driver.findElement(By.xpath("//div[@class='checkbox-ui-label']")).click();
		 // TO CLOSE THE BROWSER
		 driver.close();
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
