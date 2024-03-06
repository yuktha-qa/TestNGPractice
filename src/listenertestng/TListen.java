package listenertestng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TListen implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		// if you want to run any default code, which should run when test is started
		// then that code is written here.
		// when class starts it automatically this method gets triggered..

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// reporter.log(""+result.getName())getName() -> method name which is passed
		// this for pass and fail.
		// result is the object that is going to store infor about the method which is
		// executing. name
		System.out.println("Success of test cases and its details are : " + result.getName());
		Reporter.log("Test passed : " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// this is for fail
		System.out.println("Failure of test cases and its details are : " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// enabled property = false; when disable is true; when test method is skipped
		System.out.println("Skip of test cases and its details are : " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// 70% pass 30% fail
		System.out.println("Failure of test cases and its details are : " + result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		// when method is start
	}

	@Override
	public void onFinish(ITestContext context) {
		// when test is finished or destroying the objects or disconnect from server
	}

}