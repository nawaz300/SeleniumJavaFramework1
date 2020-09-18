package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class TestNGListeners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	    System.out.println("******Test Started :"+result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("******Test Successed :"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println("******Test Failed :"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		System.out.println("******Test Skipped :"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}
	
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		System.out.println("******Test Completed :"+context.getName());
	}

	
	
	
	
	
	
	
 /*  	public void onTestStart(ITestResult result) {
    System.out.println("******Test Started :"+result.getName());
     
	}
    public void onTestSuccess(ITestResult result) {
		 System.out.println("******Test is successful :"+result.getName());

	}
	public void onTestFailure(ITestResult result) {
		 System.out.println("******Test is failed :"+result.getName());   


	}
	public void onTestSkipped(ITestResult result) {
		 System.out.println("******Test skipped :"+result.getName());   


	}
	public void onTestFailedButWithinSuccessPercentage(ITestContext context) {
		
	}
	
	public void onStart(ITestContext context) {
		// System.out.println("******Tests Completed :"+context.getName());   		


	}
	
	public void onFinish(ITestContext context) {
		 System.out.println("******Tests Completed :"+context.getName());   		


	} */
	

} 
