package LearningjavaScriptexcution;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate the URL
		// perform type cast operator
	 JavascriptExecutor jse=(JavascriptExecutor)driver;
		//navigate the application
		jse.executeScript("window.location=arguments[0]","https://automationexercise.com/");
		
		System.out.println(jse.executeScript("return document.title"));
		WebElement signup=driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
		jse.executeScript("arguments[0].click()",signup);
		
		System.out.println(jse.executeScript("return document.URL"));
		
		jse.executeScript("history.go(0)");
		
		WebElement name=driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
		jse.executeScript("arguments[0].value='aman'",name);
		WebElement email=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		jse.executeScript("arguments[0].value='amankumar42@gmail.com'",email);
		
		WebElement sign_btn=driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
		jse.executeScript("arguments[0].click()",sign_btn);
//		System.out.println(jse.executeScript("returndocument.URL"));
//		
//		
	    WebElement email_id=driver.findElement(By.id("email"));
	    jse.executeScript("arguments[0].value='aman42@gmail.com'",email_id);
	    jse.executeScript("window.scrollBy(200,300)");
	    driver.quit();
	    
//		
	    
		
	}

}
