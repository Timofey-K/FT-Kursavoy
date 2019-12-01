package com.company;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * страница подтверждения и разлогинивания.
 */
public class Page5 extends BasePage {
    /**
     * кнопка разлогинивания.
     */
    @FindBy(xpath = "//img[@src='/images/forms/Logout.gif']")
    WebElement logOut;

    /**
     * разлогинивание.
     */
    public void flightConfirmation() {
        logOut.click();
    }
}
