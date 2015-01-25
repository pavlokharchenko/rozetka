package locators.PhonesMp3GpsPage;

import org.openqa.selenium.By;

public class SmartphonesPage {

    public static By lnkAllSmartphones = By.linkText("Все смартфоны");
    public static By txtBestSellingPhoneTitle = By.xpath("//div[contains(@class,'popularity')]/a/img[@title]");
    public static By txtBestSellingPhonesPrice = By.xpath("//div[contains(@class,'popularity')]/../../..//div[@class='g-price-uah']");

}
