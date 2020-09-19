package practice;
import org.testng.annotations.Test;
public class day4 
{
	@Test
	public void webloginHomeloan()
	{
		System.out.println("webloginHomeloan");
	}
	@Test(groups={"smoke"})
	public void MobileloginHomeloan()
	{
		System.out.println("MobileloginHomeloan");
	}
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("LoginAPIHomeLoan");
	}

}
