package Com.Cucumber.Framework.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"classpath:FeatureFile/facebookLogin.feature"})
public class FacebookLoginRunner extends AbstractTestNGCucumberTests {

}
