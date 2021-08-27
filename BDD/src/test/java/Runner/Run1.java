package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Features", glue="stepDefinition",tags="@addToCart")
public class Run1 extends AbstractTestNGCucumberTests {

}
