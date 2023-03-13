package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeatureFile/FreeCRM.feature"},
		glue= {"Tutorial6"},
		dryRun=false,
		monochrome=true,
				plugin= {
						"html:Reports/abc.html",
						"json:Reports/abc.json",
						"junit:Reports/abc.xml",
						"pretty:Reports/abc.txt"
						}
		)


public class RunnerTest {

}
