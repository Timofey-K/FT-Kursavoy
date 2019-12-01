package com.company;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * страница 2 - поиск самолётов.
 */
public class Page2 extends BasePage {
    /**
     *тип билета, одно-дву сторонний.
     */
    @FindBy(xpath = "//input[@name='tripType' and contains (@value, 'oneway')]")
    WebElement type;
    /**
     *колличество пассажиров.
     */
    @FindBy(xpath = "//select[@name='passCount']/child::option[@value='2']")
    WebElement passengers;
    /**
     *откуда вылетать.
     */
    @FindBy(xpath = "//select[@name='fromPort']/child::option[@value='Sydney']")
    WebElement departingFrom;
    /**
     *месяц вылета.
     */
    @FindBy(xpath = "//select[@name='fromMonth']/child::option[@value='8']")
    WebElement onMonth;
    /**
     *день вылета.
     */
    @FindBy(xpath = "//select[@name='fromDay']/child::option[@value='10']")
    WebElement onDay;
    /**
     *куда прилетать.
     */
    @FindBy(xpath = "//select[@name='toPort']/child::option[@value='Paris']")
    WebElement arrivingIn;
    /**
     *когда возвращаться, месяц.
     */
    @FindBy(xpath = "//select[@name='toMonth']/child::option[@value='9']")
    WebElement returningMonth;
    /**
     *когда возвращаться, день.
     */
    @FindBy(xpath = "//select[@name='toDay']/child::option[@value='3']")
    WebElement returningDay;
    /**
     *Класс билета.
     */
    @FindBy(xpath = "//input[@name='servClass' and contains"
            + " (@value, 'Business')]")
    WebElement serviceClass;
    /**
     *фирма самолёта.
     */
    @FindBy(xpath = "//select[@name='airline']/"
            + "child::option[text()='Pangea Airlines']")
    WebElement airline;
    /**
     *кнопка продолжение.
     */
    @FindBy(xpath = "//input[@name='findFlights']")
    WebElement continuE;

    /**
     * заполнени формы.
     */
    public void flightFinder() {
        type.click();
        passengers.click();
        departingFrom.click();
        onMonth.click();
        onDay.click();
        arrivingIn.click();
        returningMonth.click();
        returningDay.click();
        serviceClass.click();
        airline.click();
        continuE.click();
    }
}
