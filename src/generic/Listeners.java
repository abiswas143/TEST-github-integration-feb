package generic;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
public class Listeners implements ISuiteListener, ITestListener{
	@Override
	public void onFinish(ISuite suite) {
		Reporter.log(suite.getName() + " --> Finished..", true);
	}
	@Override
	public void onStart(ISuite suite) {
		Reporter.log(suite.getName() + " --> Started..", true);
	}
	@Override
	public void onFinish(ITestContext testblock) {
		Reporter.log(testblock.getName() + " block Finished..", true);
	}
	@Override
	public void onStart(ITestContext testblock) {
		Reporter.log(testblock.getName() + " block Started..", true);
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	}
	@Override
	public void onTestFailure(ITestResult testMethod) {
		Reporter.log(testMethod.getName() + " --> script Failed..", true);
	}
	@Override
	public void onTestSkipped(ITestResult testMethod) {
		Reporter.log(testMethod.getName() + " --> script skipped..", true);
	}
	@Override
	public void onTestStart(ITestResult testMethod) {
		Reporter.log(testMethod.getName() + " --> script Started..", true);
	}
	@Override
	public void onTestSuccess(ITestResult testMethod) {
		Reporter.log(testMethod.getName() + " --> script Passed..", true);
	}
}
