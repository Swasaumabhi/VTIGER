package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignVerificationPage {
WebDriver driver;
public CampaignVerificationPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[@class='dvHeaderText']")
private WebElement ConfirmationText;
public WebDriver getDriver() {
	return driver;
}
public WebElement getConfirmationText() {
	return ConfirmationText;
}
}
