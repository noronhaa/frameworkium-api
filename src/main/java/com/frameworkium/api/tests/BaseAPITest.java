package com.frameworkium.api.tests;

import com.frameworkium.base.ReflectionHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;

public abstract class BaseAPITest {

    protected final Logger logger = LogManager.getLogger(this);

    /** Creates the allure properties for the report, after the test run. */
    @AfterSuite(alwaysRun = true)
    public static void createAllureProperties() {
        new ReflectionHelper().createAllureProperties();
    }

}
