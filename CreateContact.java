package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// OPEN THE BROWSER
		 ChromeDriver driver=new ChromeDriver();
		// LOAD THE URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    
	    driver.findElement(By.linkText("Contacts")).click();
	    driver.findElement(By.linkText("Create Contact")).click();
	    driver.findElement(By.id("firstNameField")).sendKeys("Navya");
	    driver.findElement(By.id("lastNameField")).sendKeys("Nav");
	    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Dhaksha");
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("V");
	    driver.findElement(By.name("departmentName")).sendKeys("IT");
        driver.findElement(By.name("description")).sendKeys("SoftwareEngineer");
        driver.findElement(By.name("primaryEmail")).sendKeys("nav@gmail.com");
        WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
        Select select = new Select(state);
        select.selectByVisibleText("New York");
        driver.findElement(By.name("submitButton")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.name("importantNote")).sendKeys("cleared the description field");
        driver.findElement(By.xpath("//input[@value = 'Update']")).click();
       String title =  driver.getTitle();
       System.out.println(title);
        
	    
	    
		 

	}

}
