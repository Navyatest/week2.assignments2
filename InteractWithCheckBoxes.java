package week2.day2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		boolean selected = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected();
              System.out.println(selected);
        driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
        List<WebElement> allcheckboxes = driver.findElements(By.tagName("input"));
		int size = allcheckboxes.size();
		System.out.println(size);
		allcheckboxes.get(8).click();
		allcheckboxes.get(9).click();
		allcheckboxes.get(10).click();
		allcheckboxes.get(11).click();
		allcheckboxes.get(12).click();
		allcheckboxes.get(13).click();

	}

}
