package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    public static final String XPATH_COOKIES = "//div[contains(@class, '9o-r')]/button[2]";
    public static final String XPATH_ACCOUNT = "//a[contains(@data-testid, 'open-registration-form-button')]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        assert driver != null;
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_COOKIES)).isDisplayed()) ;
        driver.findElement(By.xpath(XPATH_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_ACCOUNT)).click();

        Thread.sleep(2000);

        WebElement dayElement = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(dayElement);
        selectDay.selectByIndex(23);

        WebElement monthElement = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(monthElement);
        selectMonth.selectByIndex(3);

        WebElement yearElement = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(yearElement);
        selectYear.selectByIndex(21);
    }
}
