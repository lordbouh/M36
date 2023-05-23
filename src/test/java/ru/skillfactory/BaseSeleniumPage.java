package ru.skillfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

abstract public class BaseSeleniumPage {
    protected WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "/home/kidney/Soft/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://skillfactory.ru");
    }
        @After
    public void tearDown(){
      driver.close();
      driver.quit();
        }

    }


