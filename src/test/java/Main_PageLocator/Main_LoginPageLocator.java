package Main_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Main_Utility.Main_Base;

public class Main_LoginPageLocator extends Main_Base {

	public  Main_LoginPageLocator() {
		PageFactory.initElements(driver, this);
			
	}
	@FindBy(linkText = "Paychex Flex login")
	public WebElement clickPayLog;
	
	
	
	
	
}
