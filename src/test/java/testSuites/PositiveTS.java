package testSuites;

/*
 * Test Suite that will run all Positive Test Cases from included classes
 */

import categories.PositiveTests;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.phonesMp3Gps.SmartphonesPageVerificationTests;

@RunWith(Categories.class)
@Categories.IncludeCategory(PositiveTests.class)
@Suite.SuiteClasses({SmartphonesPageVerificationTests.class})
public class PositiveTS {
}
