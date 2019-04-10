package com.amazon.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\panay\\PM\\Learning\\AmazonCucumber\\src\\main\\java\\com\\amazon\\feature",//Path of feature file 
		glue = {"com\\amazon\\stepdefinations"},//path of step defination file
		format = {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},//log files 
		monochrome =true,// display console in redable format
		strict = false,// check if any step in feature file is not defined 
		dryRun = false//check mappling between step defination file and feature file is correct or not 
	
		)
public class TestRunner {

}
