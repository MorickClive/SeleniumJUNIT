package webpage_Fashion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;

@Getter
public class AccountSection {

	//My Account
		@FindBy(xpath = "//*[@id='footer']/div/section[5]/div/ul/li[1]/a")
		private WebElement myOrders;
		@FindBy(xpath = "//*[@id='footer']/div/section[5]/div/ul/li[2]/a")
		private WebElement myCredit;
		@FindBy(xpath = "//*[@id='footer']/div/section[5]/div/ul/li[3]/a")
		private WebElement myAddresses;
		@FindBy(xpath = "//*[@id='footer']/div/section[5]/div/ul/li[4]/a")
		private WebElement myInfo;	
		
	//My Account
	public void myOrders(){					myOrders.click();}
	public void myCredit(){					myCredit.click();}
	public void myAddresses(){				myAddresses.click();}
	public void myInfo(){					myInfo.click();}
	
	
	public WebElement getMyOrders() {
		return myOrders;
	}
	public WebElement getMyCredit() {
		return myCredit;
	}
	public WebElement getMyAddresses() {
		return myAddresses;
	}
	public WebElement getMyInfo() {
		return myInfo;
	}
}
