package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({
		@FindBy(css= "button[class$=uitk-menu-trigger]"),
		@FindBy(xpath= "(//button[@type='button'])[2]"),
		@FindBy(xpath= "//button[text()='Sign in']")
	})
private WebElement signButton;
	@FindAll({
		@FindBy(css= "a[data-stid= link-header-account-signin]"),
		@FindBy(xpath= "//a[text()='Sign in']")
	})
private WebElement signlink;
	
	
	@FindAll({
		@FindBy(css= "input#loginFormEmailInput"),
		@FindBy(xpath= "//input[@name='email']")
	})
private WebElement username;
	
	@FindAll({
		@FindBy(css= "input#loginFormPasswordInput"),
		@FindBy(xpath= "//input[@name='password']")
	})
private WebElement password;
	
	@FindAll({
		@FindBy(css= "button#loginFormSubmitButton"),
		@FindBy(xpath= "//button[@type='submit']")
	})
	
private WebElement loginButton;
	
	@FindAll({
		@FindBy(css= "h3.uitk-error-summary-heading"),
		@FindBy(xpath= "//h3[@class='uitk-error-summary-heading']")
	})
	private WebElement emailAndPasswordNotMatched;
	
	@FindAll({
		@FindBy(css= "div#loginFormEmailInput-error"),
		@FindBy(xpath= "//div[contains(text(),'Enter a valid email address')]")
	})
	private WebElement emailIdError;
	
	@FindAll({
		@FindBy(css= "div#loginFormPasswordInput-error"),
		@FindBy(xpath= "//div[contains(text(),'Enter a password')]")
	})
	private WebElement passwordError;

	
	

	public WebElement getEmailAndPasswordNotMatched() {
		return emailAndPasswordNotMatched;
	}

	public WebElement getEmailIdError() {
		return emailIdError;
	}

	public WebElement getPasswordError() {
		return passwordError;
	}

	public WebElement getSignButton() {
		return signButton;
	}

	public WebElement getSignlink() {
		return signlink;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	

}
