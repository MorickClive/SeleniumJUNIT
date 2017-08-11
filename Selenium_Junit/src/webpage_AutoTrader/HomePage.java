package webpage_AutoTrader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	private String URL = "www.autotrader.co.uk";
	
	@FindBy(xpath = "//*[@id='searchVehiclesPriceFrom']")
	private WebElement Min;

	@FindBy(xpath = "#top-nav__buying > li:nth-child(1) > a")
	private WebElement Max;
	
	@FindBy(xpath = "//*[@id='search']/span")
	private WebElement submitSearch;
	
	@FindBy(css = ".global__quicksearchform--advancedsearch-moreoptions")
	private WebElement carSearch;
	
	public WebElement get_MinField(){return Min;}
	public WebElement get_MaxField(){return Max;}
	
	public WebElement get_Submit(){return submitSearch;}
	
	public WebElement get_carSearch(){return carSearch;}
		
	public String getURL(){return URL;}

}
