package data;

import config.ConfigReader;

public class TestDataReader {

    public static String getUsername() {

        String env =
                ConfigReader.getProperty("env");

        return ConfigReader.getProperty(
                env + ".username"
        );
    }

    public static String getPassword() {

        String env =
                ConfigReader.getProperty("env");

        return ConfigReader.getProperty(
                env + ".password"
        );
    }
}