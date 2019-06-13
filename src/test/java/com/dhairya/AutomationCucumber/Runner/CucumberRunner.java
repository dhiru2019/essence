package cucumberRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(
		 features = {"src\\test\\java\\Feature\\buying_mac_on_website.feature"}
		 ,glue={"Steps"}
		 )
		public class CucumberRunner { 
  } 