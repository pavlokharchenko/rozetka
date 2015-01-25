package tests.commons;

import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class CommonActions {

    @BeforeClass
    public static void initializeBrowser() {
        //Create new DB Tables

        //Configure and Start Browser
        Configuration.timeout = Long.parseLong(getFromProperties("timeout"));
        Configuration.browser =getFromProperties("browser");
        open(getFromProperties("url"));
    }

    @AfterClass
    public static void closeBrowser() {
        close();
    }

    @Before
    public void login() {
        // Action that should be executed before each Test Case
    }

    @After
    public void refreshPage() {
        clearBrowserCache();
        getWebDriver().navigate().refresh();
    }

    // Read configuration from property file
    public static String getFromProperties(String propName) {

        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("config.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            return prop.getProperty(propName);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
