package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class CreateAccountPojo extends BaseClass{

	public CreateAccountPojo() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(css ="input#signupFormEmailInput")
	private WebElement emailAddress;
	
	@FindBy(css ="input#signupFormFirstNameInput")
	private WebElement firstName;
	
	@FindBy(css ="input#signupFormLastNameInput")
	private WebElement lastName;
	
	@FindBy(css ="input#signupFormPasswordInput")
	private WebElement password;
	
	@FindBy(css ="button#signupFormSubmitButton")
	private WebElement continuebutton ;
	
	@FindBy(css ="h2#home_children_heading")
	private WebElement verification ;
	
	@FindBy(css ="button#home_children_button")
	private WebElement verifyButton ;
	
	@FindBy(css ="button#home_children_button")
	private WebElement catche ;

	public WebElement getVerification() {
		return verification;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}
	
	
}
