package ru.skillfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseSeleniumPage {

    private final WebDriver driver;

    public BaseSeleniumPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final String SUBSCRIPTION_NAME_FIELD = "//body[1]/div[2]/div[34]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]";
    private static final String SUBSCRIPTION_EMAIL = "//body/div[@id='allrecords']/div[@id='rec562643444']/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]";
    private static final String SUBSCRIPTION_PHONE = "//body/div[@id='allrecords']/div[@id='rec562643444']/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/input[2]";
    private static final String SEND_BUTTON = "//body/div[@id='allrecords']/div[@id='rec562643444']/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[6]/button[1]";
    private static final String SUBSCRIPTION_ERROR_MESSAGE = "//p[contains(text(),'Please fill out all required fields')]";
    private static final String TESTING_COURSE = ".tn-elem__5625611781679405234205 > .tn-atom";
    private static final  String SUBSCRIBE_NEWS_IT = "//*[@id=\"form596444548\"]/div[2]/div[1]/div/input";
    private static final String SUBSCRIBE_NEWS_IT_BUTTON = "//*[@id=\"form596444548\"]/div[2]/div[4]/button";
    private static final String COMPANY_LEARNING = "//*[@id=\"sbs-562561178-1678713806333\"]/div/a";
    private static final String CHECK_COMPANY_LEARNING = "//*[@id=\"rec425993788\"]/div/div/div[3]/h1/span";

    public void subscription_field() {
        driver.findElement(By.xpath(SUBSCRIPTION_NAME_FIELD)).sendKeys("Abra Kadabra");
        driver.findElement(By.xpath(SUBSCRIPTION_EMAIL)).sendKeys("abra@kadabra.au");
        driver.findElement(By.xpath(SUBSCRIPTION_PHONE)).sendKeys("9999999999");
        driver.findElement(By.xpath(SEND_BUTTON)).click();
    }

    public String subscription_error_message() {
        return
                driver.findElement(By.xpath(SUBSCRIPTION_ERROR_MESSAGE)).getText();
    }
    public void Course_Testing() {
        driver.findElement(By.cssSelector(TESTING_COURSE)).click();
    }

    public void SendName() {
        driver.findElement(By.id("input_1495810359387")).click();
        driver.findElement(By.id("input_1495810359387")).sendKeys("Abra Kadabra");

    }

    public void SendEmail() {
        driver.findElement(By.id("input_1495810354468")).click();
        driver.findElement(By.id("input_1495810354468")).sendKeys("abra@kadabra.au");
    }
    public void SendNumber(){
        driver.findElement(By.name("tildaspec-phone-part[]")).click();
        driver.findElement(By.name("tildaspec-phone-part[]")).sendKeys("(999) 999-99-99");
    }
    public void ClickSubmit(){
        driver.findElement(By.className("t-submit")).click();
    }

    public void subscribe_news_it(){
        driver.findElement(By.xpath(SUBSCRIBE_NEWS_IT)).sendKeys("abra@kadabra.au");
        driver.findElement(By.xpath(SUBSCRIBE_NEWS_IT_BUTTON)).click();
    }

    public void company_learning(){
        driver.findElement(By.xpath(COMPANY_LEARNING)).click();
    }
    public String check_company_learning(){
        return
     driver.findElement(By.xpath(CHECK_COMPANY_LEARNING)).getText();
    }
}





