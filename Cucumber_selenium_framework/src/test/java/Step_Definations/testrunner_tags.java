package Step_Definations;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\feature_withtages",
monochrome = true,
glue= {"Step_Definations"}, tags = "@smoke and @regression"

		)

public class testrunner_tags {

}
