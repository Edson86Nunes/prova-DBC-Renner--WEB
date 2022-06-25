package stepsDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static utils.Configs.*;

public class Hooks {

    @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        Thread.sleep(1000);
        screenshot(scenario);
        driver.quit();

    }
}
