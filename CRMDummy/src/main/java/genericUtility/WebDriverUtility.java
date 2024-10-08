package genericUtility;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public void WaitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public void WaitForTheElementToBePresent(WebDriver driver,WebElement element) {
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(30));
		w.until(ExpectedConditions.visibilityOf(element));
		
	}
	public void SwitchToFrame(WebDriver driver,int index ) {
	driver.switchTo().frame(index)	;
	
	
	}
		
	
	public void SwitchToFrame(WebDriver driver,String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	public void SwitchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
		
	}
	public void SwitchToAlertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void SwitchToAlertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public void moveToElement(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		
	}
	public void doubleClick(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	public void dragAndDrop(WebDriver driver,WebElement src ,WebElement target) {
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
		
		public void switchbackfromframe(WebDriver driver)
		{
			driver.switchTo().parentFrame();
		}
		
		public void switchBackToMainPage(WebDriver driver) {
			driver.switchTo().defaultContent();}
		
		public void switchBackToWindow(WebDriver driver ,String PartialExpTitle)
		{
		Set<String> allwindowids = driver.getWindowHandles();
				for(String windowid:allwindowids) {
					String windowTitle = driver.switchTo().window(windowid).getTitle();
					if(windowTitle.contains(PartialExpTitle)) {
				break;}}}
		
		
	public void select(WebElement element,int Index) { //method overloading,method same,so ie different length for parameters,or diffrenet data types or different positions
		Select sel=new Select(element);
		sel.selectByIndex(Index);
	}
	public void select(WebElement element,String value) {
		Select sel= new Select(element);
		sel.selectByValue(value);
		
	}
	public void select(String visibleText,WebElement element) {
		Select sel=new Select(element);
		sel.selectByVisibleText(visibleText);

	}
	
	public void takeScreenShotOfWebPage(WebDriver driver,String ssName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./CRM1/errorShots"+ssName+".png");
		
FileHandler.copy(src, dest);
	
	
	
	}
	
	}

