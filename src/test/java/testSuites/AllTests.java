package testSuites;

/*
 * Test Suite that will run all Tests from included classes
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.phonesMp3Gps.SmartphonesPageVerificationTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({SmartphonesPageVerificationTests.class})
public class AllTests {
}
