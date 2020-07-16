import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginObject extends BasePage {
	@FindBy(id="txtUsername") 
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnLogin")
	private WebElement loginBtn;
	
	@FindBy(id="welcome")
	private WebElement welcome;
	
	
	public loginObject(){
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsername(){
		return username;
	}
	public WebElement getPassword(){
		return password;
	}
	
	public void clicklogin(){
		loginBtn.click();
	}
	public WebElement getWelcome(){
		return welcome;
	}

}
