package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Курсовая работа по тостированию Сайта.
 * Выполнил Калини Тимофей.
 */
public class Kursach extends Listener {
    /**
     * создание статического драйвера.
     */
    static WebDriver driver;

    /**
     * выполнение до начала теста.
     */
    @Before
    public void podg() {
        System.setProperty("webdriver.chrome.driver",
                "E:\\g\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/");
    }

    /**
     * Сам тест.
     */
    @Test
    public void test() {
        Page1 p1 = new Page1();
        p1.init(driver);
        p1.login("test1", "test1");
        afterClickOn(p1.signField, driver);

        Page2 p2 = new Page2();
        p2.init(driver);
        p2.flightFinder();
        afterClickOn(p2.continuE, driver);

        Page3 p3 = new Page3();
        p3.init(driver);
        p3.selectFlight();
        afterClickOn(p3.continuE, driver);

        Page4 p4 = new Page4();
        p4.init(driver);
        p4.bookAFlight("Gary", "Heeb", "4465222345451213");
        afterClickOn(p4.securePurchase, driver);

        final Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        p4.securePurchase.click();


        Page5 p5 = new Page5();
        p5.init(driver);
        p5.flightConfirmation();
        afterClickOn(p5.logOut, driver);
    }

    /**
     * закрытие браузера после теста.
     */
    @After
    public void end() {
        driver.close();
        driver.quit();
    }

}
