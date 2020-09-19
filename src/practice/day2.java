package practice;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class day2 
{
	@Test(groups={"smoke"})
	public void ploan()
	{
		System.out.println("good");
		System.out.println("better");
		System.out.println("best");
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
		System.out.println("Bad");
		System.out.println("Worse");
		System.out.println("Worst");
	}
}
