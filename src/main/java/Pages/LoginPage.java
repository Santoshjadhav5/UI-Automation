package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public String DashboardURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	public String PimURL = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
	public String EmployeeListURL = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
	
	@FindBy(name = "username") private WebElement username;
	@FindBy(name = "password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement Login;
	@FindBy(xpath = "//span[text()='PIM']") private WebElement pim;
	@FindBy(xpath = "//a[text()='Add Employee']") private WebElement addEmployee;
	@FindBy(name = "firstName") private WebElement firstname;
	@FindBy(name = "lastName") private WebElement lastname;
	@FindBy(xpath = "//button[@type='submit']") private WebElement saveBtn;
	@FindBy(xpath = "//a[text()='Employee List']") private WebElement EmployeeList;
	@FindBy(xpath = "(//div[@class='oxd-input-group oxd-input-field-bottom-space']//div[2]/div/div)[1]") private WebElement SearchEmployee;
	@FindBy(xpath = "//button[@type='submit']") private WebElement SearchSubmit;
	
	
	
	
	

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return Login;
	}
	public WebElement getPim() {
		return pim;
	}
	public WebElement getAddEmployee() {
		return addEmployee;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getsaveBtn() {
		return saveBtn;
	}
	public WebElement getEmployeeList() {
		return EmployeeList;
	}
	public WebElement getSearchEmployee() {
		return SearchEmployee;
	}
	public WebElement getSearchSubmit() {
		return SearchSubmit;
	}
	
	
	
	
	
}
