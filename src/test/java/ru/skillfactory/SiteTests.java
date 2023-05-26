package ru.skillfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SiteTests {
    private static WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
private BaseSeleniumPage baseSeleniumPage;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "/home/kidney/Soft/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://skillfactory.ru");
        baseSeleniumPage = new BaseSeleniumPage(driver);
        js = (JavascriptExecutor) driver;
        vars = new HashMap<>();
    }

       @After
        public void tearDown() {
        driver.close();
        driver.quit();

    }
    public String waitForWindow(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> whNow = driver.getWindowHandles();
        Set<String> whThen = (Set<String>) vars.get("window_handles");
        if (whNow.size() > whThen.size()) {
            whNow.removeAll(whThen);
        }
        return whNow.iterator().next();
    }
    @Test
        public void Test1_clickName() {
      baseSeleniumPage.subscription_field();
        Assert.assertEquals("Please fill out all required fields",baseSeleniumPage.subscription_error_message());
    }
    @Test
    public void Test2_sign_up_for_a_course() {

        baseSeleniumPage.Course_Testing();
        {
            WebElement element = driver.findElement(By.cssSelector(".tn-elem__5608766611679951555527 > .tn-atom"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector(".tn-elem__5608766611679951555532 > .tn-atom")).click();
        vars.put("win6219", waitForWindow(2000));
        driver.switchTo().window(vars.get("win6219").toString());
        driver.findElement(By.linkText("Записаться на курс")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        baseSeleniumPage.SendName();
        baseSeleniumPage.SendEmail();
        baseSeleniumPage.SendNumber();
        baseSeleniumPage.ClickSubmit();
    }

    @Test
    public void subscribe_it_news(){
        baseSeleniumPage.subscribe_news_it();
            }

    @Test
    public void courses_for_business(){
        baseSeleniumPage.company_learning();
        Assert.assertEquals("Развивайте бизнес", baseSeleniumPage.check_company_learning());
    }

}
