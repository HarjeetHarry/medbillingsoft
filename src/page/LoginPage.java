package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//button[.='Sign In']")
	private WebElement SignInBTN;

	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}

	public void clickLogin(){
		SignInBTN.click();
	}
	
}
