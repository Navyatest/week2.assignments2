package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("yes")).click();
		boolean selected = driver.findElement(By.name("news")).isEnabled();
        System.out.println(selected);
		//driver.findElement(By.xpath("//label[text()='Find default selected radio button']"));
		boolean selected1 = driver.findElement(By.xpath("(//input[@name='age'])[2]")).isSelected();
		System.out.println(selected1);
        
	}

}
