package com.store.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features", //defino el path donde se encuentra el feature
        glue = "com.store.stepDef", //define el path donde se encuentra los stepdefinitions de cada step del feature
        plugin = {"pretty", "summary",
                "html:target/test-report.html",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml"
        },
        tags = "login",
        monochrome = false,
        publish = true,
        dryRun = false
)

public class TestRunner {

}
