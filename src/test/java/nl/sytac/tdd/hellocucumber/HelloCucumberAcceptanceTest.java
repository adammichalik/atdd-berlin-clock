package nl.sytac.tdd.hellocucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:hellocucumber/HelloCucumber.feature", tags = "@hello")
public class HelloCucumberAcceptanceTest {

}
