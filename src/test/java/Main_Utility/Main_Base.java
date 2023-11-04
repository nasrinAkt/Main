package Main_Utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;



public class Main_Base {

	public static WebDriver driver;
	public static Properties MaiPro;
	
	public Main_Base() {
		
	try {
		FileInputStream maiFle = new FileInputStream(System.getProperty("user.dir")+ ("//src//test//java//Main_Config//Main_Config.Properties"));	
		 MaiPro = new Properties();	
		MaiPro.load(maiFle);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Please,look the code");
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	
	
	public void MaiBrowser() {
	String MaiAllBrowser = MaiPro.getProperty("MaiBrowser1");
	
	if(MaiAllBrowser.equalsIgnoreCase("Chrome")) {
		System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+("//Main_ChromeDriver//chromedriver.exe"));
		   ChromeOptions my = new ChromeOptions();
		   my.addArguments("--remote-allow-origins=*"); 
		   driver = new ChromeDriver();
		   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Main_Utiliti.pageLoadTimeout));
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Main_Utiliti.implicitlyWait));
		   driver.manage().window().maximize();	
			
		
		
	}
	else if(MaiAllBrowser.equalsIgnoreCase("Edge")) {
		
		 System.setProperty("Webdriver.edge.driver", System.getProperty("user.dir")+("//Main_EdgeDriver//msedgedriver.exe"));
		   EdgeOptions you = new EdgeOptions();
		   you.addArguments("--remote-allow-origins=*"); 
		   driver = new EdgeDriver();
		   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Main_Utiliti.pageLoadTimeout));
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Main_Utiliti.implicitlyWait));
		   driver.manage().window().maximize();	
	
		
	}
		
	}
	public static void MaiLaunchURL(String URL) {
		
		driver.get(MaiPro.getProperty("MaiURL"));
		
		
	}
	
	
	
	
}
