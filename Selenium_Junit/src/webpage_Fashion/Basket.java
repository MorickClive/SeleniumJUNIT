package webpage_Fashion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;

@Getter
public class Basket {
	// BASKET
	@FindBy(xpath = "//*[@id='header']/div[3]/div/div/div[3]/div/a")
	private WebElement myBasket;
	
	// BASKET
	public void myBasket(){				myBasket.click();}

	public WebElement getMyBasket() {
		return myBasket;
	}	
}
