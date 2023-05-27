package ru.skillfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.*;
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
        public void test1_clickName() {
      baseSeleniumPage.subscription_field();
        Assert.assertEquals("Please fill out all required fields",baseSeleniumPage.subscription_error_message());
    }
    @Test
    public void test2_sign_up_for_a_course() {

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
    public void test3_subscribe_it_news(){
        baseSeleniumPage.subscribe_news_it();
            }

    @Test
    public void test4_courses_for_business(){
        baseSeleniumPage.company_learning();
        Assert.assertEquals("Развивайте бизнес", baseSeleniumPage.check_company_learning());
    }
    @Test
    public void test5_courses_java(){
        baseSeleniumPage.programming_main_page();
        Assert.assertEquals("Курсы Java",baseSeleniumPage.java_courses());
    }
    @Test
    public void test6_artificial_intelligence_course(){
        baseSeleniumPage.data_science_ai();
        Assert.assertEquals("Искусственный интеллект: курсы и профессии",baseSeleniumPage.artificial_intelligence_check());
    }
    @Test
    public void test7_data_analyst(){
        {
            WebElement element = driver.findElement(By.cssSelector(".tn-elem__5625611781679404895615 > .tn-atom"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".tn-elem__5625611781679404895615 > .tn-atom")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".tn-elem__5690922001679953431614 > .tn-atom"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector(".tn-elem__5690922001679953431614 > .tn-atom")).click();
        vars.put("win9546", waitForWindow(2000));
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.switchTo().window(vars.get("win9546").toString());
        Assert.assertEquals("Аналитик данных",baseSeleniumPage.data_analyst_check());
    }
    @Test
    public void test8_high_education(){
        baseSeleniumPage.high_education();
        Assert.assertEquals("высшее образование в лучших университетах страны — онлайн", baseSeleniumPage.high_education_check());
    }

    @Test
    public void test9_backend_developer(){
        baseSeleniumPage.backend_developer();
        Assert.assertEquals("Курсы по Backend-разработке", baseSeleniumPage.backend_developer_check());
    }

    @Test
    public void test10_web_developing(){
        baseSeleniumPage.web_developing();
        Assert.assertEquals("Курсы по веб-разработке", baseSeleniumPage.web_developing_check());
    }
    @Test
    public void test11_application_developing(){
        baseSeleniumPage.application_developing();
        Assert.assertEquals("Курсы по разработке мобильных приложений",baseSeleniumPage.application_developing_check());
    }

    @Test
    public void test12_games_developing(){
        baseSeleniumPage.games_developing();
        Assert.assertEquals("Курсы по разработке игр",baseSeleniumPage.games_developing_check());
    }

    @Test
    public void test13_security_courses(){
        baseSeleniumPage.security_courses();
        Assert.assertEquals("Курсы по информационной безопасности: обучение кибербезопасности", baseSeleniumPage.security_courses_check());
    }

    @Test
    public void test14_it_without_code_courses(){
        baseSeleniumPage.it_without_code_courses();
        Assert.assertEquals("IT без кода", baseSeleniumPage.it_without_code_courses_check());
    }

    @Test
    public void test15_marketing_courses(){
        baseSeleniumPage.marketing_courses();
        Assert.assertEquals("Курсы маркетинга", baseSeleniumPage.marketing_courses_check());
    }

    @Test
    public void test16_management_courses(){
        baseSeleniumPage.management_courses();
        Assert.assertEquals("Курсы по менеджменту и управлению",baseSeleniumPage.management_courses_check());
    }

    @Test
    public void test17_subscribe_news_it_incorrect_email(){
        baseSeleniumPage.subscribe_news_it_incorrect_email();
        Assert.assertEquals("Please enter a valid email address", baseSeleniumPage.subscribe_it_news_incorrect_email_check());
    }

    @Test
    public void test18_python_course_incorrect_email() {
        baseSeleniumPage.try_courses_incorrect_email();
        vars.put("window_handles", driver.getWindowHandles());
        baseSeleniumPage.choose_python_developer();
        vars.put("win3009", waitForWindow(2000));
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.switchTo().window(vars.get("win3009").toString());
        baseSeleniumPage.sign_up_for_a_course_button();
        baseSeleniumPage.sign_up_for_a_course_name();
        baseSeleniumPage.sign_up_for_a_course_email();
        baseSeleniumPage.sign_for_a_course_phone();
        baseSeleniumPage.sign_for_a_course_confirm_button();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
    }

    @Test
    public void test19_email_to_bosses(){
        baseSeleniumPage.email_info();
        Assert.assertEquals("a",baseSeleniumPage.email_info_check());
    }

    @Test
    public void test20_email_boss_SF(){
        baseSeleniumPage.email_info();
        Assert.assertEquals("a",baseSeleniumPage.email_boss());
    }
}


