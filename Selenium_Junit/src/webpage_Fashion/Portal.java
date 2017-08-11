package webpage_Fashion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Portal {
	
	private String URL = "http://automationpractice.com";
	
	// Sections for navigation
	public mainSection goto_Main = new mainSection();
	public InfoSection goto_Information = new InfoSection();
	public SupportBar goto_SupportBar = new SupportBar();
	public Basket goto_Basket = new Basket();
	public AccountSection goto_myAccount = new AccountSection();
	
	// set factories
	public Portal(WebDriver wd){
		goto_Main = 			PageFactory.initElements(wd, mainSection.class);
		goto_Information = 	PageFactory.initElements(wd, InfoSection.class);
		goto_SupportBar =	PageFactory.initElements(wd, SupportBar.class);
		goto_Basket = 		PageFactory.initElements(wd, Basket.class);
		goto_myAccount = 	PageFactory.initElements(wd, AccountSection.class);
	}
	
	// Behaviours
	public String getURL(){ return URL;}
}
