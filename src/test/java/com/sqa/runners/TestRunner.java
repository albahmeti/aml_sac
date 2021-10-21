package com.sqa.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;


@CucumberOptions(
    features = {"classpath:features/"},
    glue = {"com.sqa"},
    plugin = {"pretty","html:target/reports/html/","json:target/reports/json/report.json",
              "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true, dryRun=false,publish=false,tags = " ")
   
public class TestRunner extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @BeforeSuite
    public void beforeTest(ITestContext context) {
        context.getSuite().getXmlSuite().setDataProviderThreadCount(Integer.parseInt(System.getProperty("threads")));
        context.getCurrentXmlTest().setName("Test Runner");
        context.getCurrentXmlTest().getSuite().setName("Test Suite");
    }
    }



