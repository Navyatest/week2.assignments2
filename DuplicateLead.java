package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("//span[text()= 'Email']")).click();
	    driver.findElement(By.name("emailAddress")).sendKeys("n@gmail.com");
	    driver.findElement(By.xpath("//button[text()= 'Find Leads']")).click();
	    Thread.sleep(2000);
	    String lead = driver.findElement(By.xpath("//div[contains(@class,'partyId')][1]/a[@class='linktext']")).getText();
	    System.out.println(lead);
	    driver.findElement(By.xpath("//div[contains(@class,'partyId')][1]/a[@class='linktext']")).click();
	    Thread.sleep(2000);
	   driver.findElement(By.linkText("Duplicate Lead")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	    driver.close();
	    
	    
	 
	 
	    

	}

}
