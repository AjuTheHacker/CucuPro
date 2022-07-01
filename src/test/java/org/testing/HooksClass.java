package org.testing;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseClass;
//import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;








public class HooksClass extends BaseClass {

	@Before(order=1)
	public void lunchBrowser() {
		
System.out.println("Before Hooks**********1");
lunchChrome();
	}
	
	@Before(order=3)
	public void loadURL() {
		
System.out.println("Before Hooks**********2");
passURL("https://www.wotif.co.nz/login?ckoflag=0&uurl=e3id%3Dredr%26rurl%3D%2F");

	}
	
	@Before(order=2)
	public void maximize() {
		
System.out.println("Before Hooks**********3");
maxWin();
	}
	
	@After(order=2)
	public void takeScreenShot(io.cucumber.java.Scenario s) throws IOException {
		String name = s.getName();
		String pic = name.replace(" ", "_");
		takeScreenshotFullCall(pic);
System.out.println("After Hooks**********1");

	}
	
	@After(order=1)
	public void closeBrowser(io.cucumber.java.Scenario s1){
		
		if(s1.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] sc = tk.getScreenshotAs(OutputType.BYTES);
			//s1.embed(sc, "image/png");
	s1.attach(sc, "image/png", "Wofit");
		}
//closeBrowser();
	}
	
	
}
