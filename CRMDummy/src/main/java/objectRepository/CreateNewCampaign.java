package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCampaign {
WebDriver driver;
public CreateNewCampaign(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(name="campaignname")
private WebElement CampaignNameTextfield;

public WebDriver getDriver() {
	return driver;
}
public WebElement getCampaignNameTextfield() {
	return CampaignNameTextfield;
}
public WebElement getCloseDate() {
	return CloseDate;
}
public WebElement getSavebutton() {
	return Savebutton;
}

@FindBy(name="closingdate")
private WebElement CloseDate;
@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement Savebutton;
}

