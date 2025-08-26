package ValidateLoginPage;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testphp.vulnweb.com/login.php");
		driver.findElement(By.name("uname")).sendKeys("test1");
		driver.findElement(By.name("pass")).sendKeys("test");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	 
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("http://testphp.vulnweb.com/userinfo.php")) {
			
			System.out.println("successfully landing to the home page");
		}else
		{
			System.out.println("error");
		}
	
	}
}
