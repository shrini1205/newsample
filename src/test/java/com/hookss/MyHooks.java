package com.hookss;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseClass.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks extends BaseClass {

	@Before
	

	public void beforeScenario1(Scenario s) {
		//System.out.println("Hooks-@Before");
		String name = s.getName();
		System.out.println(name);
	}

	@After
	public void afterScenario(Scenario s) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] fbImage = ts.getScreenshotAs(OutputType.BYTES);
		s.embed(fbImage,"image/png");
	}

	/*
	 * @After public void afterScenario() { System.out.println("Hooks-@After"); }
	 * 
	 * @BeforeStep public void beforeStep() { System.out.println("beforeStep"); }
	 * 
	 * @AfterStep public void afterStep() { System.out.println("afterStep"); }
	 */
}
