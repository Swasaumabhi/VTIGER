package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganization {
WebDriver driver;
public CreateNewOrganization(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(name="accountname")
private WebElement AccountNameTextField;
public WebDriver getDriver() {
	return driver;
}
public WebElement getAccountNameTextField() {
	return AccountNameTextField;
}
public WebElement getIndustryTextField() {
	return IndustryTextField;
}
public WebElement getTypeTextField() {
	return TypeTextField;
}
public WebElement getPhoneTextField() {
	return PhoneTextField;
}
public WebElement getSaveButton() {
	return SaveButton;
}
@FindBy(name="industry")
private WebElement IndustryTextField;
@FindBy(name="accounttype")
private WebElement TypeTextField;
@FindBy(id="phone")
private WebElement PhoneTextField;
@FindBy(name="button")
private WebElement SaveButton;

}
