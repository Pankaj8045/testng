package ExtentReportLisetner;
 
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
 
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.xml.XmlSuite;
 
import com.mongodb.util.JSON;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class ExtentReportListner implements IReporter {
private ExtentReports extent;
 
public String outdir;
 
public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
extent = new ExtentReports(outputDirectory + File.separator + "ExtentReportTestNG.html", true);
outdir = outputDirectory;
for (ISuite suite : suites) {
Map<String, ISuiteResult> result = suite.getResults();
 
for (ISuiteResult r : result.values()) {
ITestContext context = r.getTestContext();
 
buildTestNodes(context.getPassedTests(), LogStatus.PASS);
buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
}
}
 
extent.flush();
extent.close();
}
 
private void buildTestNodes(IResultMap tests, LogStatus status) {
ExtentTest test;
 
if (tests.size() > 0) {
for (ITestResult result : tests.getAllResults()) {
test = extent.startTest(result.getMethod().getMethodName());
 
String scrshotpath = Reporter.getOutput(result).toString();
 
scrshotpath = scrshotpath.substring(1, scrshotpath.length() - 1);
 
scrshotpath = outdir + File.separator + "Screenshots" + File.separator + scrshotpath;
 
System.out.println("result is trying ----------" + scrshotpath);
 
test.setStartedTime(getTime(result.getStartMillis()));
test.setEndedTime(getTime(result.getEndMillis()));
 
for (String group : result.getMethod().getGroups())
test.assignCategory(group);
 
String message = "Test " + status.toString().toLowerCase() + "ed";
 
if (result.getThrowable() != null)
message = result.getThrowable().getMessage();

 
test.log(status, message, test.addScreenCapture(scrshotpath));

 
extent.endTest(test);
}
}
}
 
private Date getTime(long millis) {
Calendar calendar = Calendar.getInstance();
calendar.setTimeInMillis(millis);
return calendar.getTime();
}
}
