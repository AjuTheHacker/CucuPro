package base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReports {
	
	
	public static void CucumberReports(String jsonPath) {

		File f = new File(System.getProperty("user.dir")+"\\target\\Reports\\JvmReports");
	
	
	Configuration con = new  Configuration(f, "Wotif");
	con.addClassifications("Platfrom", "Window 8.1");
	con.addClassifications("Browser Name", "Chrome");
	con.addClassifications("Browser version", "103");
	con.addClassifications("Sprint", "14.3");
	
	List<String> list = new ArrayList<>();
	
	list.add(jsonPath);
	
	
	ReportBuilder r = new ReportBuilder(list, con);
	r.generateReports();
	
	}

}
