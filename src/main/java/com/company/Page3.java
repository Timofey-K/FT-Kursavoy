package com.company;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Страница 3 - Выбор самолёта.
 */
public class Page3 extends BasePage {
    /**
     * Выбор самолёта туда.
     */
    @FindBy(xpath = "//input[@name='outFlight' and contains"
           + " (@value, 'Pangea Airlines$362$274$9:17')]")
    WebElement depart;
    /**
     * Выбор самолёта обратно.
     */
    @FindBy(xpath = "//input[@name='inFlight' and contains"
            + " (@value, 'Blue Skies Airlines$631$273$14:30')]")
    WebElement returN;
    /**
     * Кнопка продолжения.
     */
    @FindBy(xpath = "//input[@name='reserveFlights']")
    WebElement continuE;

    /**
     *выбор самолётов.
     */
    public void selectFlight() {
        depart.click();
        returN.click();
        continuE.click();
    }
}
