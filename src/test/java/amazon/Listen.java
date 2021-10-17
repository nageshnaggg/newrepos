package amazon;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Listen implements ITestListener {
	
public void onTestSuccess(ITestResult result)
	{
		
		System.out.println("success");
	}
	
	public void onTestFailure(ITestResult result)
	{
		
		System.out.println("fail");
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("test skipped");
	}

	public void onStart(ITestContext context)
	{
	  
		System.out.println("test started");
		
	}
	

	public void onFinish(ITestContext context)
	{
	  
		System.out.println("test finished");
		
	}
	
}
