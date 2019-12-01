package com.company;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Страница 4 - Заполнение личных данных.
 */
public class Page4 extends BasePage {

    //passengers
    /**
     * имя первого пасажира.
     */
    @FindBy(xpath = "//input[@name='passFirst0']")
    WebElement firstName1;
    /**
     * фамилия первого пассажира.
     */
    @FindBy(xpath = "//input[@name='passLast0']")
    WebElement lastName1;
    /**
     * еда первого пассажира.
     */
    @FindBy(xpath = "//select[@name='pass.0.meal']"
            + "/child::option[@value='DBML']")
    WebElement meal1;
    /**
     *имя второго пассажира.
     */
    @FindBy(xpath = "//input[@name='passFirst1']")
    WebElement firstName2;
    /**
     *фамилия второго пассажира.
     */
    @FindBy(xpath = "//input[@name='passLast1']")
    WebElement lastName2;
    /**
     *еда второго пассажира.
     */
    @FindBy(xpath = "//select[@name='pass.1.meal']"
            + "/child::option[@value='VGML']")
    WebElement meal2;

    //credit card
    /**
     *тип кредитки.
     */
    @FindBy(xpath = "//select[@name='creditCard']/child::option[@value='BA']")
    WebElement cardType;
    /**
     *номер кредитки.
     */
    @FindBy(xpath = "//input[@name='creditnumber']")
    WebElement numberCC;
    /**
     *выпуск кредитки месяц.
     */
    @FindBy(xpath = "//select[@name='cc_exp_dt_mn']"
            + "/child::option[text()='02 \n" +"                      ']")
    WebElement expirationMonth;
    /**
     *выпуск кредитки год.
     */
    @FindBy(xpath = "//select[@name='cc_exp_dt_yr']"
            + "/child::option[@value='2009']")
    WebElement expirationYear;
    /**
     *имя владельца кредитки.
     */
    @FindBy(xpath = "//input[@name='cc_frst_name']")
    WebElement firstNameCC;
    /**
     *отчество владельца кредитки.
     */
    @FindBy(xpath = "//input[@name='cc_mid_name']")
    WebElement midNameCC;
    /**
     *фамилия владельца кредитки.
     */
    @FindBy(xpath = "//input[@name='cc_last_name']")
    WebElement lastNameCC;

    //Billing Address
    /**
     *адрес отправки 1.
     */
    @FindBy(xpath = "//input[@name='billAddress1']")
    WebElement billAdr1;
    /**
     *продолжения адресса 1.
     */
    @FindBy(xpath = "//input[@name='billAddress2']")
    WebElement billAdr2;
    /**
     *город отправления.
     */
    @FindBy(xpath = "//input[@name='billCity']")
    WebElement billCity;
    /**
     *штат отправления.
     */
    @FindBy(xpath = "//input[@name='billState']")
    WebElement billState;
    /**
     *код.
     */
    @FindBy(xpath = "//input[@name='billZip']")
    WebElement billPostalCode;
    /**
     *страна отправления.
     */
    @FindBy(xpath = "//select[@name='billCountry']/child::option[@value='9']")
    WebElement billCountry;

    //Delivery Address
    /**
     *адесс доставки 2.
     */
    @FindBy(xpath = "//input[@name='delAddress1']")
    WebElement delAdr1;
    /**
     *продолжение адресса 2.
     */
    @FindBy(xpath = "//input[@name='delAddress2']")
    WebElement delAdr2;
    /**
     *город доставки.
     */
    @FindBy(xpath = "//input[@name='delCity']")
    WebElement delCity;
    /**
     *штат доставки.
     */
    @FindBy(xpath = "//input[@name='delState']")
    WebElement delState;
    /**
     *код.
     */
    @FindBy(xpath = "//input[@name='delZip']")
    WebElement delPostalCode;
    /**
     *страна доставки.
     */
    @FindBy(xpath = "//select[@name='delCountry']/child::option[@value='4']")
    WebElement delCountry;
    /**
     *кнопка подтверждения.
     */
    @FindBy(xpath = "//input[@name='buyFlights']")
    WebElement securePurchase;

    /**
     *заполнение формы.
     * @param firstname - имя 1 пассажира.
     * @param lastname - фамилия 1 пассажира.
     * @param numCC - номер кредитки.
     */
    public void bookAFlight(final  String firstname,
                            final  String lastname,
                            final String numCC) {
        //passengers
        firstName1.sendKeys(firstname);
        lastName1.sendKeys(lastname);
        meal1.click();

        firstName2.sendKeys("Joy");
        lastName2.sendKeys("Bee");
        meal2.click();

        //credit card
        cardType.click();
        numberCC.sendKeys(numCC);
        expirationMonth.click();
        expirationYear.click();
        firstNameCC.sendKeys("Joy");
        midNameCC.sendKeys("Ren");
        lastNameCC.sendKeys("Bee");

        //Billing Address
        billAdr1.sendKeys("1532 Boe asg");
        billAdr2.sendKeys("");
        billCity.sendKeys("Ryz");
        billState.sendKeys("CA");
        billPostalCode.sendKeys("95030");
        billCountry.click();

        //Delivery Address
        delAdr1.sendKeys("9456 Rrrrr");
        delAdr2.sendKeys("");
        delCity.sendKeys("Par");
        delState.sendKeys("FR");
        delPostalCode.sendKeys("45654");
        delCountry.click();
    }
}
