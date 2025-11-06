package LinkedText;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Forgotten password?")).click();
        // driver.findElement(By.partialLinkText("Forgotten password?")).click();
		
		WebElement SearchDisplayedstatus=driver.findElement(By.id("small-searchterms"));
		if(SearchDisplayedstatus.isDisplayed()) {
			System.out.println("Search Box is Displyed");
		}
		else {
			System.out.println("Search Box is Not Displyed");
		}
		WebElement SearchButton=driver.findElement(By.className("Search"));
		if(SearchButton.isEnabled()) {
		System.out.println("Button is Enabled");
		}
		else {
			System.out.println("Button is Not Enabled");
		}
		

	}

}
