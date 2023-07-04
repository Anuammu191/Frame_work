package Reportingtools;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extentreport
{
@Test
public void test1()
{
    //step1
	 ExtentReports rep = new ExtentReports("./reports/r.html", false);
	 //step2
	 ExtentTest t1 = rep.startTest("tc1");
	//step3
	 t1.log(LogStatus.PASS, "passes tc");
	 t1.log(LogStatus.FAIL, "failed tc");
	 t1.log(LogStatus.SKIP, "tc skipped");
}
}
