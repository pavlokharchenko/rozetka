package tests.phonesMp3Gps;

import categories.AcceptanceTests;
import categories.PositiveTests;
import categories.SmallTests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import locators.LandingPage;
import locators.PhonesMp3GpsPage.PhonesMp3GpsPageMainPage;
import locators.PhonesMp3GpsPage.SmartphonesPage;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import tests.commons.CommonActions;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SmartphonesPageVerificationTests extends CommonActions {

    @Category({AcceptanceTests.class, PositiveTests.class, SmallTests.class})
    @Test
    public void getListOfBestSellingSmartphones() {

        int NUMBER_OF_PAGES = 3;
        HashMap<String, Integer> phonePrices = new HashMap<String, Integer>();

        $(LandingPage.lnkPhonesMp3Gps).click();
        $(PhonesMp3GpsPageMainPage.lnkPhonesMp3Gps).click();
        $(SmartphonesPage.lnkAllSmartphones).click();

        for(int i = 2; i <= NUMBER_OF_PAGES ; i++){
            // Take a list of Best Selling Phone's Titles
            Iterator<SelenideElement> phonesTitles = $$(SmartphonesPage.txtBestSellingPhoneTitle).iterator();

            // Take a list of Best Selling Phone's Prices
            Iterator<SelenideElement> phonesPrices = $$(SmartphonesPage.txtBestSellingPhonesPrice).iterator();

            // Store and Print results
            while(phonesTitles.hasNext()) {
                String phoneName = phonesTitles.next().getAttribute("title");
                int phonePrice = Integer.parseInt(phonesPrices.next().getText().replaceAll("[^0-9]", ""));
                phonePrices.put(phoneName,phonePrice);
                System.out.println(phoneName + " - " + phonePrice + " uah.");
            }

            // Go to the next page
            By pageNumber = By.xpath("//li[@id='page" + i + "']/a");
            $(pageNumber).click();

            // Wait while next page will be loaded
            $(pageNumber).shouldNot(Condition.exist);
        }

        assertTrue(4 == phonePrices.size());

    }

}