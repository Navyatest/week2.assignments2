package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Navya");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    Thread.sleep(6000);
	    WebElement lead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a[@class='linktext']"));
	    lead.getText();
	    lead.click();
	    Thread.sleep(4000);
	    driver.findElement(By.linkText("Edit")).click();
	    Thread.sleep(4000);
	    WebElement company = driver.findElement(By.name("companyName"));
	    company.clear();
	    company.sendKeys("wipro");
	    driver.findElement(By.xpath("//input[@value='Update']")).click();
	    Thread.sleep(4000);
	   // driver.close();
	    
	}

}
