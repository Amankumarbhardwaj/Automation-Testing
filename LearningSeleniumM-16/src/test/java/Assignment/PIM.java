package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PIM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
String act_title=driver.getTitle();
String exp_title="OrangeHRM";
if(exp_title.equals(act_title))
{
	System.out.println("Login page Verified==>Pass");
}
else
{
	System.out.println("Login verified==>Fail");
}
//username
WebElement username =driver.findElement(By.xpath("//input[@placeholder='Username']"));
if(username.isDisplayed()==true && username.isEnabled()==true)
{
	System.out.println("username is displayed & enabaled ==> Pass");
}
else
{
	System.out.println("username is displayed & enabaled ==> Fail");
}
//send key to username
username.sendKeys("Admin");
//password
WebElement pass =driver.findElement(By.xpath("//input[@placeholder='Password']"));
if(pass.isDisplayed()==true && pass.isEnabled()==true)
{
	System.out.println("Password is displayed & enabaled ==> Pass");
}
else
{
	System.out.println("Password is displayed & enabaled ==> Fail");
}
//send keys to pass
pass.sendKeys("admin123");
//button displayed and enabled
WebElement login_button=driver.findElement(By.xpath("//button[@type='submit']"));
if(login_button.isDisplayed()==true && login_button.isEnabled()==true)
{
	System.out.println("login_button is displayed & enabaled ==> Pass");
}
else
{
	System.out.println("login_button is displayed & enabaled ==> Fail");
}
//click login
login_button.click();
//dashboard displaye and enable
WebElement Dashboard=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
if(Dashboard.isDisplayed()==true && Dashboard.isEnabled()==true)
{
	System.out.println("Dashboard is displayed & enabaled ==> Pass");
}
else
{
	System.out.println("Dashboard is displayed & enabaled ==> Fail");
}
//pim display and enabled
Thread.sleep(3000);
WebElement pim=driver.findElement(By.linkText("PIM"));
if(pim.isDisplayed()==true && pim.isEnabled()==true)
{
	System.out.println("pim is displayed & enabaled ==> Pass");
}
else
{
	System.out.println("pim is displayed & enabaled ==> Fail");
}
//click pim
pim.click();
//verify pim page
WebElement Verify_pim_page =driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
if(Verify_pim_page.isDisplayed()==true && Verify_pim_page.isEnabled()==true)
{
	System.out.println("pim page is displayed & enabaled ==> Pass");
}
else
{
	System.out.println("pim page is displayed & enabaled ==> Fail");
}
//Add Employee
WebElement Addemployee =driver.findElement(By.linkText("Add Employee"));
if(Addemployee.isDisplayed()==true && Addemployee.isEnabled()==true)
{
	System.out.println("Addemploy button is displayed & enabaled ==> Pass");
}
else
{
	System.out.println("Addemploy button is displayed & enabaled ==> Fail");
}
//click addemployee
Addemployee.click();
WebElement Addemp_page =driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']"));
if(Addemp_page.isDisplayed()==true && Addemp_page.isEnabled()==true)
{
	System.out.println("Addemploy page is displayed & enabaled ==> Pass");
}
else
{
	System.out.println("Addemploy page is displayed & enabaled ==> Fail");
}
WebElement first =driver.findElement(By.xpath("//input[@name='firstName']"));
WebElement middle =driver.findElement(By.xpath("//input[@name='middleName']"));
WebElement last =driver.findElement(By.xpath("//input[@name='lastName']"));
WebElement empid=driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']"));
WebElement save =driver.findElement(By.xpath("//button[@type='submit']"));
if(first.isDisplayed()==true && first.isEnabled()==true)
{
	System.out.println("first name is displayed & enabaled ==> Pass");
}
else
{
	System.out.println("first name is displayed & enabaled ==> Fail");
}
if(middle.isDisplayed()==true && middle.isEnabled()==true)
{
	System.out.println("middle name is displayed & enabaled ==> Pass");
}
else
{
	System.out.println("middle name is displayed & enabaled ==> Fail");
}
if(last.isDisplayed()==true && last.isEnabled()==true)
{
	System.out.println("last name is displayed & enabaled ==> Pass");
}
else
{
	System.out.println("last name is displayed & enabaled ==> Fail");
}
if(empid.isDisplayed()==true && empid.isEnabled()==true)
{
	System.out.println("empid is displayed & enabaled ==> Pass");
}
else
{
	System.out.println("empid name is displayed & enabaled ==> Fail");
}
empid.clear();
if(save.isDisplayed()==true && save.isEnabled()==true)
{
	System.out.println("save button is displayed & enabaled ==> Pass");
}
else
{
	System.out.println("save button is displayed & enabaled ==> Fail");
}
first.sendKeys("Lucifer");
middle.sendKeys("morning");
last.sendKeys("star");
empid.sendKeys("0123");
save.click();
WebElement EmpList =driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 --strong']"));
if(EmpList.isDisplayed()==true && EmpList.isEnabled()==true)
{
	System.out.println("Employee list is displayed & enabaled ==> Pass");
}
else
{
	System.out.println("Employee list is displayed & enabaled ==> Fail");
}
System.out.println("Employee was added to list");
driver.quit();
}
}