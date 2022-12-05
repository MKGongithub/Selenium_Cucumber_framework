package Step_Definationshooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Hooksfile.feature",
monochrome = true,
glue= {"Step_Definationshooks"}, 
plugin={"pretty","html:target/htmlreports/index.html",
          "json:target/jsonreports/report.json", 
         "junit:target/junitreports/report.xml"}
)
public class testrunnerhooks {

}
