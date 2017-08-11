package webpage_Fashion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;

@Getter
public class InfoSection {
	
	//Information
	@FindBy(xpath = "//*[@id='block_various_links_footer']/ul/li[1]/a")
	private WebElement specials;
	@FindBy(xpath = "//*[@id='block_various_links_footer']/ul/li[2]/a")
	private WebElement newProducts;
	@FindBy(xpath = "//*[@id='block_various_links_footer']/ul/li[3]/a")
	private WebElement bestSell;
	@FindBy(xpath = "//*[@id='block_various_links_footer']/ul/li[4]/a")
	private WebElement ourStore;
	@FindBy(xpath = "//*[@id='block_various_links_footer']/ul/li[5]/a")
	private WebElement contactUs_FT;
	@FindBy(xpath = "//*[@id='block_various_links_footer']/ul/li[6]/a")
	private WebElement TandC;
	@FindBy(xpath = "//*[@id='block_various_links_footer']/ul/li[7]/a")
	private WebElement aboutUs;
	@FindBy(xpath = "//*[@id='block_various_links_footer']/ul/li[8]/a")
	private WebElement siteMap;
	
	//Information
	
	public void Special(){					specials.click();}
	public void newProducts(){				newProducts.click();}
	public void bestSell(){				bestSell.click();}
	public void ourLoc(){					ourStore.click();}
	public void Contact(){					contactUs_FT.click();}
	public void TermsANDConditions(){		TandC.click();}
	public void aboutUs(){					aboutUs.click();}
	public void siteMap(){					siteMap.click();}
	
	
	public WebElement getSpecials() {
		return specials;
	}
	public WebElement getNewProducts() {
		return newProducts;
	}
	public WebElement getBestSell() {
		return bestSell;
	}
	public WebElement getOurStore() {
		return ourStore;
	}
	public WebElement getContactUs_FT() {
		return contactUs_FT;
	}
	public WebElement getTandC() {
		return TandC;
	}
	public WebElement getAboutUs() {
		return aboutUs;
	}
	public WebElement getSiteMap() {
		return siteMap;
	}
	
	
}
