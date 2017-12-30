package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class ProcedureListPage {
	@FindBy(xpath="//a[text()='Code System ']")
	private WebElement CodeSystem;
	
	@FindBy(xpath="//a[text()='Procedure List']")
	private WebElement ProcedureList;

	public ProcedureListPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	public void MoveCodeSystem(){
		
	}
	public void ClickProcedureList(){
		ProcedureList.click();
	}
	public void verifyTitle(WebDriver driver,String eTitle){
		WebDriverWait wait=new WebDriverWait(driver,10);
		try{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is Matching",true);
		}
		catch(Exception e){
			Reporter.log("Title is NOT Matching",true);
			Assert.fail();
		}

	}
}
