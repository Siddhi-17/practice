package swaglab_webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class SwagLabCartPage extends SeleniumUtility{
	
	public SwagLabCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//button[@name='checkout']")
	private WebElement checkoutButton;
	
	public WebElement getcheckoutButton()
	{
		return checkoutButton;
	}
	//() to do operation on page
	public void performCheckout()
	{
		clickOnElement(checkoutButton);
	}
}
/**Elements needed on Home page
 * checkoutButton
 */
