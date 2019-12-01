package com.company;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Страница 1 - главная страница.
 */
public class Page1 extends BasePage {
    /**
     *  поле логина.
     */
    @FindBy(xpath = "//input[@name='userName']")
    WebElement loginField;
    /**
     * поле пароля.
     */
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;
    /**
     * кнопка для входа.
     */
    @FindBy(xpath = "//input[@name='login']")
    WebElement signField;

    /**
     * метод для входав аккаунт.
     * @param login - логин
     * @param password - пароль
     */
    public void login(final String login, final String password) {
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        signField.click();

    }
}
