package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchelementattribute {
	

	public static void main(String[]args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement searchbox=driver.findElement(By.xpath("//input[@id=\'small-searchterms\']"));
	searchbox.sendKeys("Book");
	WebElement searchbutton=driver.findElement(By.xpath("//input[@type='submit']"));
	searchbutton.click();
	String Productname=driver.findElement(By.xpath("//a[text()='Health Boook']")).getText();
	System.out.println(Productname);
	
	}
}
