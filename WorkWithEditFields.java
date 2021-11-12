package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithEditFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("n@gmail.com");
		WebElement ele = driver.findElement(By.xpath("//input[@value='Append ']"));
		//ele.clear();
		ele.sendKeys("navya");
	   String Str =	driver.findElement(By.name("username")).getAttribute("value");
	   System.out.println(Str);
	   WebElement toclear = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
	   toclear.clear();
	   boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
	   System.out.println(enabled);
	   
	   
	   
	}

}
