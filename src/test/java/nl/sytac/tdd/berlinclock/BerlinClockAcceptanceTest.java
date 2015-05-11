package nl.sytac.tdd.berlinclock;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/BerlinClockTime.feature")
public class BerlinClockAcceptanceTest {

}
