package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText="Organizations")
	private WebElement OrganizationLink;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrganizationLink() {
		return OrganizationLink;
	}

	public WebElement getContactLink() {
		return ContactLink;
	}

	public WebElement getMoreLink() {
		return MoreLink;
	}

	public WebElement getCampaignsLink() {
		return CampaignsLink;
	}

	public WebElement getAdministratorImage() {
		return AdministratorImage;
	}

	public WebElement getSignOutLink() {
		return SignOutLink;
	}
	@FindBy(linkText="Contacts")
	private WebElement ContactLink;
	
	
	@FindBy(xpath="//img[@src='themes/softed/images/menuDnArrow.gif']")
	private WebElement MoreLink;
	
	@FindBy(name="Campaigns")
	private WebElement CampaignsLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement AdministratorImage;
	
	@FindBy(linkText="Sign Out")
	private WebElement SignOutLink;
	
	public void logout()
	{
		Actions act=new Actions(driver);
		act.moveToElement(AdministratorImage).perform();
		SignOutLink.click();
	}
	
	public void NavigateToCampaign() {
		Actions act=new Actions(driver);
		act.moveToElement(MoreLink).perform();
		CampaignsLink.click();
	}
	

}
