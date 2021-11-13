package week2.day2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithHyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
         driver.findElement(By.linkText("Go to Home Page")).click();
         driver.navigate().back();
         String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
         System.out.println(attribute);
         driver.findElement(By.linkText("Verify am I broken?")).click();
         String str = driver.getTitle();
         System.out.println(str);
         driver.navigate().back();
         driver.findElement(By.linkText("Go to Home Page")).click();
         driver.navigate().back();
         List<WebElement> findElements = driver.findElements(By.tagName("a"));
         int size = findElements.size();
         System.out.println(size);
	}
}
