package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*
 * Test Case
 * ------
 * 1) Launch Browser (chrome)
 * 2) Open Url httl://demo.opencart.com/
 * 3)  Validate title should be "Your Store"
 * 4) close browser
 */
public class firsttestcase {

	public static void main(String[] args) {
		
		//1) Launch browser (chrome)
		//ChromeDriver driver=new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
		//2) Open URL https:/demo.opencart.com/
		driver.get("https://www.cricbuzz.com/");
		//3)  Validate title should be "Your Store"
		///*
		///
		String expectedtitle="Cricbuzz.com";
		 String act_title=driver.getTitle();
		 
		
		if(expectedtitle.equals(act_title))
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		//4) close browser
		driver.close();
		//driver.quit();
//*/
	}

}
