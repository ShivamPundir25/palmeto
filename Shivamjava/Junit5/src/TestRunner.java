import org.junit.platform.launcher.listeners.TestExecutionSummary.Failure;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result result=JUnitCore.runClasses(JunitTestSuite.class);
		for(org.junit.runner.notification.Failure failure:result.getFailures())
		{
			
			System.out.println(failure.toString());
		}
System.out.println(result.wasSuccessful());
	}
	
}
