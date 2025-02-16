package bdd_testrunner;//package test_runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features",
        glue = {"step_definitions"},
        dryRun = false

        //plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
)
public class  Test_Runner {
}

