package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewContactPage {
WebDriver driver;
public NewContactPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(name="lastname")
private WebElement LatNameTextField;

public WebDriver getDriver() {
	return driver;
}
public WebElement getLatNameTextField() {
	return LatNameTextField;
}
public WebElement getMobile() {
	return mobile;
}
public WebElement getSupportStartDate() {
	return SupportStartDate;
}
public WebElement getSupportEndDate() {
	return SupportEndDate;
}
public WebElement getSaveButton() {
	return SaveButton;
}
public WebElement getNewOrgImage() {
	return NewOrgImage;
}
public WebElement getSearchBar() {
	return SearchBar;
}
public WebElement getSearchButton() {
	return SearchButton;
}
public WebElement getOrgIncontact() {
	return orgIncontact;
}
@FindBy(id="mobile")
private WebElement mobile;
@FindBy(xpath="//input[@name='support_start_date']")
private WebElement SupportStartDate;
@FindBy(xpath="//input[@name='support_end_date']")
private WebElement SupportEndDate;
@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement SaveButton;
@FindBy(xpath="//img[@src='themes/softed/images/select.gif'][1]")
private WebElement NewOrgImage;
@FindBy(name="search_text")
private WebElement SearchBar;
@FindBy(name="search")
private WebElement SearchButton;
@FindBy(xpath = "//input[@name='account_name']/following-sibling::img")
private WebElement orgIncontact;


}

