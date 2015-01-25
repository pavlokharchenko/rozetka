package testSuites;

/*
 * Test Suite that will run all Negative Test Cases from included classes
 */

import categories.NegativeTests;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.phonesMp3Gps.SmartphonesPageVerificationTests;

@RunWith(Categories.class)
@Categories.IncludeCategory(NegativeTests.class)
@Suite.SuiteClasses({SmartphonesPageVerificationTests.class})
public class NegativeTS {
}
