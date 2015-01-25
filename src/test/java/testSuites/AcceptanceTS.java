package testSuites;

/*
 * Acceptance Test Suite
 */

import categories.AcceptanceTests;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.phonesMp3Gps.SmartphonesPageVerificationTests;


@RunWith(Categories.class)
@Categories.IncludeCategory(AcceptanceTests.class)
@Suite.SuiteClasses({SmartphonesPageVerificationTests.class})
public class AcceptanceTS {
}
