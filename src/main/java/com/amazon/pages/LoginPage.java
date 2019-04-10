package com.amazon.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;
import com.amazon.util.BaseTest;



public class LoginPage extends BaseTest{
	
	
	@FindBy(how = How.ID, using = "nav-link-accountList")
	WebElement loginhover;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='nav-signin-tt nav-flyout']//div//span[@class='nav-action-inner'][contains(text(),'Sign in')]")
	WebElement signinButton;
	
	
	@FindBy(how = How.ID, using = "ap_email")
	WebElement usernamefiled;

	@FindBy(how = How.ID, using = "ap_password")
	WebElement pwdfiled;
	
	@FindBy(how = How.ID, using = "signInSubmit")
	WebElement signInSubmit;
	
	
	//Action
	public void signinMouseHover() throws InterruptedException {
		loginhover.click();
//		Actions action = new Actions(driver);
//		Thread.sleep(3000);
//	action.moveToElement(loginhover).build().perform();
	}
	
	public void clicksignin() {
		//signinButton.click();
	}
	
	public void enterusername(String un) {
		usernamefiled.sendKeys(un);
	}
	
	public void enterpwd(String pwd) {
		pwdfiled.sendKeys(pwd);
	}
	
	public void clicksigninbtn() {
		signInSubmit.click();
	}
//		public Homepage login(String username, String password ) {
//			
//			return new Homepage();
//		}

	
	
	
	//Initiallize the page objects 
		public LoginPage() {
			
			PageFactory.initElements(driver, this);
		}




		public String validateLoginPage() {
			// TODO Auto-generated method stub
			 return driver.getTitle();
		}

}
