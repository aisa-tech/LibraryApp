package com.cydeo.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
        "json:target/cucumber.json",
        "html:target/cucumber-reports.html",
        "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/cydeo/library/step_definitions",
        publish = true,
        tags = "@smoke",
        dryRun = false

)

public class CukesRunner {

}
