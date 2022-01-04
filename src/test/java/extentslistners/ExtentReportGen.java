package extentslistners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {
	static ExtentReports extent;
	public static ExtentReports extentReportGenerator() {
		
		String path= System.getProperty("user.dir")+"//reports//zerodhareport.html";
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		reporter.config().setReportName("ZerodhaTestReport");
		reporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("browser", "chrome");
		extent.setSystemInfo("executedby", "sept batch");
		extent.setSystemInfo("os", "windows 10 pro");
		return extent;
	}

}
