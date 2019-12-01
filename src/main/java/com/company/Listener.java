package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

/**
 * .
 */
public class Listener implements WebDriverEventListener {
    /**
     * .
     * @param webDriver .
     */
    public void beforeAlertAccept(final WebDriver webDriver) { }

    /**
     * .
     * @param webDriver .
     */
    public void afterAlertAccept(final WebDriver webDriver) { }

    /**
     * .
     * @param webDriver .
     */
    public void afterAlertDismiss(final WebDriver webDriver) { }

    /**
     * .
     * @param webDriver .
     */
        public void beforeAlertDismiss(final WebDriver webDriver) { }

    /**
     *  .
     * @param s .
     * @param webDriver .
     */
    public void beforeNavigateTo(final String s, final WebDriver webDriver) { }

    /**
     *  .
     * @param s .
     * @param webDriver .
     */
    public void afterNavigateTo(final String s, final WebDriver webDriver) { }

    /**
     *  .
     * @param webDriver .
     */
    public void beforeNavigateBack(final WebDriver webDriver) { }

    /**
     *  .
     * @param webDriver .
     */
    public void afterNavigateBack(final WebDriver webDriver) { }

    /**
     *  .
      * @param webDriver .
     */
    public void beforeNavigateForward(final WebDriver webDriver) { }

    /**
     *  .
      * @param webDriver .
     */
    public void afterNavigateForward(final WebDriver webDriver) { }

    /**
     *  .
      * @param webDriver .
     */
    public void beforeNavigateRefresh(final WebDriver webDriver) { }

    /**
     * .
      * @param webDriver .
     */
    public void afterNavigateRefresh(final WebDriver webDriver) { }

    /**
     *  .
      * @param by .
     * @param webElement .
     * @param webDriver .
     */
    public void beforeFindBy(final By by,
                             final WebElement webElement,
                             final WebDriver webDriver) { }

    /**
     *  .
      * @param by .
     * @param webElement .
     * @param webDriver .
     */
    public void afterFindBy(final By by,
                            final WebElement webElement,
                            final WebDriver webDriver) { }

    /**
     *  .
      * @param webElement .
     * @param webDriver .
     */
    public void beforeClickOn(final WebElement webElement,
                              final WebDriver webDriver) { }
    /**
     * .
     * @param webElement - элемент - кнопка .
     * @param webDriver - драйвер .
     */
    public void afterClickOn(final WebElement webElement,
                             final WebDriver webDriver) {
    System.out.println("Переход к следующей странице");
    }

    /**
     *  .
     * @param webElement .
     * @param webDriver .
     * @param charSequences .
     */
    public void beforeChangeValueOf(final WebElement webElement,
                                    final WebDriver webDriver,
                                    final CharSequence[] charSequences) { }

    /**
     *  .
     * @param webElement .
     * @param webDriver .
     * @param charSequences .
     */
    public void afterChangeValueOf(final WebElement webElement,
                                   final WebDriver webDriver,
                                   final CharSequence[] charSequences) { }

    /**
     *  .
     * @param s .
     * @param webDriver .
     */
    public void beforeScript(final String s, final WebDriver webDriver) { }

    /**
     *  .
     * @param s .
     * @param webDriver .
     */
    public void afterScript(final String s, final WebDriver webDriver) { }

    /**
     *  .
     * @param s .
     * @param webDriver .
     */
    public void beforeSwitchToWindow(final String s,
                                     final WebDriver webDriver) { }

    /**
     *  .
      * @param s .
     * @param webDriver .
     */
    public void afterSwitchToWindow(final String s,
                                    final WebDriver webDriver) { }

    /**
     *  .
      * @param throwable .
     * @param webDriver .
     */
    public void onException(final Throwable throwable,
                            final WebDriver webDriver) { }

    /**
     *  .
      * @param outputType .
     * @param <X> .
     */
    public <X> void beforeGetScreenshotAs(final OutputType<X> outputType) { }

    /**
     *  .
      * @param outputType .
     * @param x .
     * @param <X> .
     */
    public <X> void afterGetScreenshotAs(final OutputType<X> outputType,
                                         final X x) { }

    /**
     *  .
      * @param webElement .
     * @param webDriver .
     */
    public void beforeGetText(final WebElement webElement,
                              final WebDriver webDriver) { }

    /**
     *  .
      * @param webElement .
     * @param webDriver .
     * @param s .
     */
    public void afterGetText(final WebElement webElement,
                             final WebDriver webDriver,
                             final String s) { }
}
