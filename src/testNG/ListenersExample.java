package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExample implements  ITestListener {
	
	  public void onTestStart(ITestResult result) {
		    // not implemented
		  System.out.println("test case is going to execute");
		  }


	  public void onTestSuccess(ITestResult result) {
		    // not implemented
		  System.out.println("test case passed");
		  }

	  public void onTestFailure(ITestResult result) {
		    // not implemented
		  System.out.println("test case failed");
		  }

	  public void onTestSkipped(ITestResult result) {
		    // not implemented
		  System.out.println("test case skipped");
		  }

	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    // not implemented
		  System.out.println("test case failed within limits");
		  }

	
	  public void onTestFailedWithTimeout(ITestResult result) {
		    onTestFailure(result);
		  }


	  public void onStart(ITestContext context) {
		    // not implemented
		  System.out.println("Before Everything");
		  }

	  public void onFinish(ITestContext context) {
		    // not implemented
		  System.out.println("After Everything");
		  }

}
