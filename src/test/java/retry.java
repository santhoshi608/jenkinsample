import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;
import org.testng.ITestResult;


@Test
public   class retry  implements IRetryAnalyzer{

	 int count=0;
  int maxtry=0;
  @Test
  public boolean retry(ITestResult result) {
	  if(!result.isSuccess()&& count<maxtry) {
		  count++;
		  System.out.println(count);
		  result.setStatus(ITestResult.FAILURE);
		  return true;
	  }
	  else {
		  result.setStatus(ITestResult.FAILURE);
	  return false;
	  }
  }
}
