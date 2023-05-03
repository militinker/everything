package class4;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("test case has pass"+result.getName());  // to get the name of the test case that failed or passed
    }

    public void onTestFailure(ITestResult result){
        System.out.println("test case has failed");
    }

}
