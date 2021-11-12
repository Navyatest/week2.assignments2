package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
	    driver.findElement(By.xpath("//span[text()= 'Phone']")).click();
	    driver.findElement(By.name("phoneNumber")).sendKeys("996");
	    driver.findElement(By.xpath("//button[text()= 'Find Leads']")).click();
	    Thread.sleep(5000);
	    String lead1 = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).getText();
	    Thread.sleep(5000);
	   System.out.println(lead1);
	   driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
	   driver.findElement(By.linkText("Delete")).click();
	   driver.findElement(By.linkText("Find Leads")).click();
	   driver.findElement(By.name("id")).sendKeys(lead1);
	   driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	//driver.close();
	
	    
	    
	    
		

	}

}
