package Xpath;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the song: ");
		String song=sc.next();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.youtube.com/");
	WebElement searchbox=driver.findElement(By.xpath("//input[@name=\'search_query']"));
	searchbox.sendKeys(song,Keys.ENTER);
	WebElement firstvideo=driver.findElement(By.xpath("//a[@id='video-title']"));
	firstvideo.click();

	}

}
