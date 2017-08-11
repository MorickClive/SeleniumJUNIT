package webpage_Fashion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Data;
import lombok.Getter;


@Getter
public class mainSection {
	
	// Main Nav
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement Women;
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dresses;
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement Tshirts;
	
	public void Nav_Women(){Women.click();}
	public void Nav_Dresses(){Dresses.click();}
	public void Nav_Tshirts(){Tshirts.click();}
	
	public WebElement getWomen() {
		return Women;
	}
	public WebElement getDresses() {
		return Dresses;
	}
	public WebElement getTshirts() {
		return Tshirts;
	}
	
	

}
