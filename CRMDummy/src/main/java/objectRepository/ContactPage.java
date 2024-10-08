package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
		WebDriver driver;
		public ContactPage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
}
		public WebDriver getDriver() {
			return driver;
		}
		public WebElement getNewCampaignImage() {
			return NewCampaignImage;
		}
		@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
		private WebElement NewCampaignImage;
}