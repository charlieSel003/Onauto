
import org.testng.annotations.Test;

public class loginTest {
	
	@Test
	public void test1(){
		System.out.println("test1");
	}
	@Test
	public void atest2(){
		System.out.println("test2");
	}
	@Test(groups={"Regression","sanity"})
	public void test3(){
		System.out.println("test3");
	}
	@Test
	public void test4(){
		System.out.println("test4");
	}
	@Test(groups={"Regression"})
	public void atest5(){
		System.out.println("test5");
	}
	

}
