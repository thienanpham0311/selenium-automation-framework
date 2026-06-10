package tests;

import config.ConfigReader;
import org.testng.annotations.Test;

public class ConfigTest {

    @Test
    public void verifyConfig() {

        System.out.println(
                ConfigReader.getProperty("env")
        );

        System.out.println(
                ConfigReader.getBaseUrl()
        );
    }
}