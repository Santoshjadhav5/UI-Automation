package UIFunctionality;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest{
	LoginPage lp;
	@Test
	public void test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		lp = new LoginPage(driver);
		lp.getUsername().sendKeys("Admin");
		lp.getPassword().sendKeys("admin123");
		lp.getLogin().click();
		String DashboardUrl = driver.getCurrentUrl();
		Assert.assertEquals(DashboardUrl,lp.DashboardURL );
		lp.getPim().click();
		
		String PimUrl = driver.getCurrentUrl();
		Assert.assertEquals(PimUrl, lp.PimURL);
		
		lp.getAddEmployee().click();
		lp.getFirstname().sendKeys("Ronaldo");
		lp.getLastname().sendKeys("Cristiano");
		lp.getsaveBtn().click();
		
		String EmployeeListUrl = driver.getCurrentUrl();
		Assert.assertEquals(EmployeeListUrl, lp.EmployeeListURL);
		
		lp.getEmployeeList().click();
			
	}
}
