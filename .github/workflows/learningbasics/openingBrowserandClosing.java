package learningbasics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openingBrowserandClosing {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the author name: ");
		String author=sc.next();
		
		//Open the Browser
		
		WebDriver driver=new ChromeDriver();
		
		//navigate to the Application via url
		
		driver.get("https://demo.nopcommerce.com/");
		
		//close the browser
		
		driver.quit();
		System.out.println("Excution Done By"+author);
	}

}
