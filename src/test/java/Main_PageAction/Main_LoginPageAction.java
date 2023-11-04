package Main_PageAction;

import java.util.Iterator;
import java.util.Set;





import Main_PageLocator.Main_LoginPageLocator;
import Main_Utility.Main_Base;

public class Main_LoginPageAction extends Main_Base {
	Main_LoginPageLocator main_LoginPageLocator = new Main_LoginPageLocator();
	
	public void clickmaipaychexloginlink() throws Exception {
		main_LoginPageLocator.clickPayLog.click();
	
    
	}
	
	public void gotonextcomebacktofirstwindow() throws Exception {
		Set<String>all = driver.getWindowHandles();
	    Iterator<String>tor	= all.iterator();
		String parent	= tor.next();
	    String child = tor.next();
	    
	    driver.switchTo().window(child);
	   
		Thread.sleep(5000);
		
		driver.switchTo().window(parent);
		Thread.sleep(5000);
	}
	
	
	
	
	
}
