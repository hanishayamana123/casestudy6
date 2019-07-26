package Hani_runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber .class)
@CucumberOptions(features="Mydemoddc2",glue="Ddc2_mystepdefinitions",tags= {"@Regression,@Sanity"},
plugin={"html:target/cucumber-htmlreport.html"})

public class Myrunner {
	

}
