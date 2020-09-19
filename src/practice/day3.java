package practice;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class day3 
{
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("I will execute first in this class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("I will execute last in this class");
	}
	@Parameters({"URL"})
	@Test
	public void weblogincarloan(String urlname)
	{
		System.out.println("weblogin car");
		System.out.println(urlname);
	}
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("I will execute first in this test before any method");
	}
	@AfterMethod
	public void afterevery()
	{
		System.out.println("I will execute last in this test before any method");
	}
	@Test(groups={"smoke"})
	public void Mobilelogincarloan()
	{
		System.out.println("Mobilelogincarloan");
	}
	@BeforeSuite()
	public void bfsuite()
	{
		System.out.println("I am number 1");
	}
	@Test(enabled=false) 
	public void MobilesignincarLoan()
	{
		System.out.println("Mobile Sign In");
	}
	@Test(timeOut=5000)
	public void MobilesignoutcarLoan()
	{
		System.out.println("Mobile Sign out");
	}
	@Test(dependsOnMethods={"weblogincarloan","MobilesignoutcarLoan"})
	public void APIcarloan()
	{
		System.out.println("APIcarloan");
	}
}