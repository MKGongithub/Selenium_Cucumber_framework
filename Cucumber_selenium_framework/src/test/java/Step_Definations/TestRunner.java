package Step_Definations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;  //manualimoported

//  test runner is use to create trst files  in html/json nad xml format
//testrunner syntax
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features", glue= {"Step_Definations"},
monochrome = true,


plugin = {"pretty","html:target/htmlreports/index.html",
          "json:target/jsonreports/report.json", 
         "junit:target/junitreports/report.xml"}
		)

public class TestRunner {
	
	
}
 