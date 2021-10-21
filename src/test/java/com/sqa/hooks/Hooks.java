package com.sqa.hooks;

import com.codeborne.selenide.Configuration;
import com.sqa.ui.core.Highlighter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.spring.CucumberContextConfiguration;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import java.util.Map;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.addListener;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

@CucumberContextConfiguration
@ContextConfiguration("classpath:cucumber.xml")
public class Hooks {
    @Autowired
    Environment environment;

    private DesiredCapabilities capabilities;
    @Before("@ui")
    public void init(Scenario scenario) {
        browser=environment.getBrowser();
        startMaximized=true;
        timeout=environment.getTimeout();
        pageLoadTimeout=environment.getPage_timeout();
        addListener(new Highlighter());
        clearBrowserCookies();
        clearBrowserCache();
        if(Boolean.valueOf(System.getProperty("remote"))){
            capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", "chrome");
            capabilities.setCapability("browserVersion", "91.0");
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", false));
            Configuration.browserCapabilities.merge(capabilities);
            remote = "http://localhost:4444/wd/hub/";}
        open(environment.getUrl());

    }

    @After("@ui")
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.getStatus().toString().equalsIgnoreCase("FAILED");
        } else if (scenario.getStatus().toString().equalsIgnoreCase("PASSED")) {
            System.out.println(scenario.getName() + ": PASSED");
        } else {
            System.out.println(scenario.getName() + ": Skipped");}
    }




}
