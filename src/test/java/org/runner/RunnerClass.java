package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import base.JvmReports;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\asus\\eclipse-workspace\\Wotof\\Featurefile",
		glue ="org.testing",
		dryRun = false,
		monochrome =true,
		tags = "@somke",
		plugin = {"pretty","html:C:\\Users\\asus\\eclipse-workspace\\Wotof\\target\\Reports\\htmlReports.html",
				"junit:C:\\Users\\asus\\eclipse-workspace\\Wotof\\target\\Reports\\JnuitReport.xml",
				"json:C:\\Users\\asus\\eclipse-workspace\\Wotof\\target\\Reports\\jsonReport.json",
				"rerun:C:\\Users\\asus\\eclipse-workspace\\Wotof\\Rerun\\FiledTest.txt "
		}
		)
/*"pretty","junit:target/Reports/reports_xml1.xml"
,"html:target/Reports/reports1.html",
"json:target/Reports/reports_json.json"}*/
public class RunnerClass {
@AfterClass
	public static void ReportGen() {
	JvmReports.CucumberReports(System.getProperty("user.dir")+"\\target\\Reports\\jsonReport.json");

	}
	
	

}
