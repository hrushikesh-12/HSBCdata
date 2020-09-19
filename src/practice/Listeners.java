package practice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListeners interface implements Listeners inters
public class Listeners implements ITestListener
{

	@Override
	public void onFinish(ITestContext arg0) 
	{
		
		
	}

	@Override
	public void onStart(ITestContext arg0) 
	{
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) 
	{
		
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) 
	{
		
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) 
	{
		
		
	}

	@Override
	public void onTestStart(ITestResult arg0) 
	{
		
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) 
	{
		System.out.println("I successfully executed listenerss pass code");
		
	} 

}
