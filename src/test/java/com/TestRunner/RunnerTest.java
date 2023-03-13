package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeatureFile/xyz.feature"},
		glue= {"Tutorial2"},
		dryRun=false,
		monochrome=true
		)
public class RunnerTest {

}
