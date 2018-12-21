package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FaceBookTestingApp {
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://pl-pl.facebook.com/");


        while (!driver.findElement(By.xpath(XPATH_SELECT_DAY)).isDisplayed());
        while (!driver.findElement(By.xpath(XPATH_SELECT_MONTH)).isDisplayed());
        while (!driver.findElement(By.xpath(XPATH_SELECT_YEAR)).isDisplayed());

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoardForDays = new Select(selectDay);
        selectBoardForDays.selectByIndex(20);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoardForMonths = new Select(selectMonth);
        selectBoardForMonths.selectByIndex(3);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoard = new Select(selectYear);
        selectBoard.selectByIndex(23);
    }
}
