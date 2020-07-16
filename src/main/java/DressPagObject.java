import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressPagObject extends BasePage {
	
	@FindBys(@FindBy(xpath="//a[@class='product_img_link']//img"))
	private List<WebElement> prdcount;
	
	@FindBy(xpath="//span[@class='heading-counter']")
	private WebElement counttxt;
	
	@FindBy(id="newsletter-input")
	private WebElement newsltr;
	
	@FindBy(name="submitNewsletter")
	private WebElement arrow;
	
	 public DressPagObject(){
		 PageFactory.initElements(driver, this);
	 }
	
	 public WebElement getnewsltr(){
		 return newsltr;
	 }
	public WebElement getarrow(){
		return arrow;
	}
	public int getprdcount(){
		return prdcount.size();
	}
		
		public int getcounttxt1(){
			String count=counttxt.getText();
			String [] num=count.split(" ");
			int v=Integer.parseInt(num[2]);
			return v;
		}
	


	private void getcounttxt() {
		// TODO Auto-generated method stub
		
	}

}
