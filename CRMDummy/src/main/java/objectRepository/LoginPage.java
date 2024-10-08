package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.PropertFileUtility;

public class LoginPage {
	
	
	//Create constuctor with name same as classname
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	PropertFileUtility putil=new PropertFileUtility;
	
@FindBy(name="user_name")
private WebElement usernameTF;

public WebElement getUsernameTF() {
	return usernameTF;
}

public WebElement getPasswordTF() {
	return PasswordTF;
}

public WebElement getLoginBtn() {
	return LoginBtn;
}

@FindBy(name="user_password")
private WebElement PasswordTF;




public void login() {
	String username = putil.readDataFromProperties("Username");
	
	String pwd=putil.readDataFromProperties("Password");
	
	usernameTF.sendKeys(username);
	PasswordTF.sendKeys(pwd);
	LoginBtn.click();
}













@FindBy(id="submitButton")
private WebElement LoginBtn;


}
