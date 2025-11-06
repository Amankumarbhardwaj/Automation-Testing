package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//name
		//driver.findElement(By.name("field-keywords")).sendKeys("Mac");
		//id
		//boolean logoDisplayedstatus=driver.findElement(By.id("a-page")).isDisplayed();
	//System.out.println(logoDisplayedstatus);
		//linktext & partialLinkTest
		//driver.findElement(By.linkText("Books")).click();
		//driver.findElement(By.partialLinkText("ook")).click();
		
		//List<WebElement> headerLinks=driver.findElements(By.className("top-menu"));
		//System.out.println("Total Number of Header Links: "+headerLinks.size());
		//List<WebElement>links=driver.findElements(By.tagName("a"));
		//System.out.println("Total Number of Header Links: "+links.size());
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println("Total Number of Header images: "+images.size());
	}

}
