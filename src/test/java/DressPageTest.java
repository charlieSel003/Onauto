import java.util.Random;

import org.testng.annotations.Test;

public class DressPageTest {
	
	DressPagObject dp;
	int random=new Random().nextInt(50000);
	String v="testrest" + random + "@gmail.com";
	
	public DressPageTest(){
		dp=new DressPagObject();
	}
	@Test
	public void verfiynewLetter(){
		dp.getnewsltr().sendKeys(v);
		dp.getarrow().click();
		
	}
}
