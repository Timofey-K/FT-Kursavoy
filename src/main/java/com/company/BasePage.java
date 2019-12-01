package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**.
 * класс отвечает за PageFactory на всех старницах
 */
public class BasePage {

    /**.
     * наследуемый метод
     * @param driver - драйвер браузера
     */
    public void init(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
