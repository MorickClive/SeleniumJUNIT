package webpage_Fashion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;

@Getter
public class SupportBar {
	// Support bar
	@FindBy(xpath = "//*[@id='contact-link']/a")
	private WebElement contactUs;
	@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	private WebElement signIn;
	
	public void contactUs(){				contactUs.click();}
	public void signIn(){					signIn.click();}
	
	
	public WebElement getContactUs() {
		return contactUs;
	}
	public WebElement getSignIn() {
		return signIn;
	}	
}
