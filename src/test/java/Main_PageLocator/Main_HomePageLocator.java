package Main_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Main_Utility.Main_Base;

public class Main_HomePageLocator extends Main_Base{

	
	
	public Main_HomePageLocator() {
		PageFactory.initElements(driver, this);
			
	}
	@FindBy(id="")
	public WebElement clickPay;
	
	
	
	
}
