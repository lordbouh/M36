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
    private static final String PROGRAMMING_MAIN_PAGE = "//*[@id=\"rec562561178\"]/div/div/div[25]/a";
    private static final String PROGRAMMING_JAVA = "//*[@id=\"rec569086576\"]/div/div/div[5]/a";
    private static final String JAVA_COURSES = "//*[@id=\"rec520650424\"]/div/div/div/h1";
    private static final String DATA_SCIENCE_MAIN_PAGE = "//*[@id=\"rec562561178\"]/div/div/div[32]/a";
    private static final String ARTIFICIAL_INTELLIGENCE = "//*[@id=\"rec569092786\"]/div/div/div[7]/a";
    private static final String ARTIFICIAL_INTELLIGENCE_TEXT = "//*[@id=\"rec569089586\"]/div/div/div[3]/h1";
    private static final String DATA_ANALYST_CHECK = "//*[@id=\"rec453742605\"]/div/div/div[4]/div";
    private static final String HIGN_EDUCATION_MAIN_PAGE = "//*[@id=\"rec562561178\"]/div/div/div[53]/a";
    private static final String HIGH_EDUCATION_CHECK = "//*[@id=\"rec407825981\"]/div/div/div[3]/h1";

    private static final String ALL_COURSES_MAIN_PAGE = "//*[@id=\"rec562561178\"]/div/div/div[20]/a";
    private static final String BACKEND_DEVELOPER = "//*[@id=\"rec567539569\"]/div/div/div[18]/a";
    private static final String BACKEND_DEVELOPER_CHECK = "//*[@id=\"rec565298354\"]/div/div/div[3]/h1";
    private static final String WEB_DEVELOPING = "//*[@id=\"rec567539569\"]/div/div/div[16]/a";
    private static final String WEB_DEVELOPING_CHECK = "//*[@id=\"rec569093451\"]/div/div/div[3]/h1";
    private static final String APPLICATION_DEVELOPING = "//*[@id=\"rec567539569\"]/div/div/div[15]/a";
    private static final String APPICATION_DEVELOPING_CHECK = "//*[@id=\"rec565292716\"]/div/div/div[3]/h1";
    private static final String GAMES_DEVELOPING = "//*[@id=\"rec567539569\"]/div/div/div[14]/a";
    private static final String GAMES_DEVELOPING_CHECK = "//*[@id=\"rec520594043\"]/div/div/div/h1";
    private static final String SECURITY_COURSES = "//*[@id=\"rec567539569\"]/div/div/div[8]/a";
    private static final String SECURITY_COURSES_CHECK = "//*[@id=\"rec565290318\"]/div/div/div[3]/h1";
    private static final String IT_WITHOUT_CODE = "//*[@id=\"rec567539569\"]/div/div/div[23]/a";
    private static final String IT_WITHOUT_CODE_CHECK = "//*[@id=\"rec555662258\"]/div/div/div/h1";
    private static final String MARKETING_COURSES = "//*[@id=\"rec567539569\"]/div/div/div[9]/a";
    private static final String MARKETING_COURSES_CHECK = "//*[@id=\"rec520590635\"]/div/div/div/h1";
    private static final String MANAGEMENT_COURSES = "//*[@id=\"rec567539569\"]/div/div/div[11]/a";
    private static final String MANAGEMENT_COURSES_CHECK = "//*[@id=\"rec520598643\"]/div/div/div/h1";
    private static final String SUBSCRIBE_NEWS_IT_ERROR_MESSAGE = "//*[@id=\"tilda-popup-for-error\"]/div[1]/p";
    private static final String PYTHON_COURSES = "//*[@id=\"rec569086576\"]/div/div/div[18]/a";
    private static final String PYTHON_DEVELOPER = "//*[@id=\"rec569090284\"]/div/div/div[3]/a";
    private static final String SIGN_UP_FOR_A_COURSE_BUTTON = "//*[@id=\"rec521548955\"]/div/div/div[5]/a";
    private static final String SIGN_UP_FOR_A_COURSE_NAME_FIELD = "//*[@id=\"form521548955\"]/div[2]/div[1]/div/input";
    private static final String SIGN_UP_FOR_A_COURSE_EMAIL_FIELD = "//*[@id=\"form521548955\"]/div[2]/div[2]/div/input";
    private static final String SIGN_UP_FOR_A_COURSE_PHONE_FIELD = "//*[@id=\"form521548955\"]/div[2]/div[3]/div/div[1]/input[2]";
    private static final String SIGN_UP_FOR_A_COURSE_CONFIRM_BUTTON = "//*[@id=\"form521548955\"]/div[2]/div[7]/button";
    private static final String CONTACTS_MAIN_PAGE = "//*[@id=\"sbs-562561178-1678713806326\"]/div/a";
    private static final String INFO_EMAIL_CONTACTS = "//*[@id=\"rec472344041\"]/div/div/div[6]/div/a";
    private static final String EMAIL_BOSS_SF = "//*[@id=\"rec472344041\"]/div/div/div[8]/div/a";
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
    public void programming_main_page(){
        driver.findElement(By.xpath(PROGRAMMING_MAIN_PAGE)).click();
        driver.findElement(By.xpath(PROGRAMMING_JAVA)).click();
    }
    public String java_courses(){
        return
                driver.findElement(By.xpath(JAVA_COURSES)).getText();
    }
    public void data_science_ai(){
        driver.findElement(By.xpath(DATA_SCIENCE_MAIN_PAGE)).click();
        driver.findElement(By.xpath(ARTIFICIAL_INTELLIGENCE)).click();
    }
    public String artificial_intelligence_check(){
        return
        driver.findElement(By.xpath(ARTIFICIAL_INTELLIGENCE_TEXT)).getText();
    }
    public String data_analyst_check(){
        return
        driver.findElement(By.xpath(DATA_ANALYST_CHECK)).getText();
    }
    public void high_education(){
        driver.findElement(By.xpath(HIGN_EDUCATION_MAIN_PAGE)).click();
    }
    public String high_education_check(){
        return
                driver.findElement(By.xpath(HIGH_EDUCATION_CHECK)).getText();
    }
    public void backend_developer(){
        driver.findElement(By.xpath(ALL_COURSES_MAIN_PAGE)).click();
        driver.findElement(By.xpath(BACKEND_DEVELOPER)).click();
    }
    public String backend_developer_check(){
        return
                driver.findElement(By.xpath(BACKEND_DEVELOPER_CHECK)).getText();
    }

    public void web_developing(){
        driver.findElement(By.xpath(ALL_COURSES_MAIN_PAGE)).click();
        driver.findElement(By.xpath(WEB_DEVELOPING)).click();
    }
    public String web_developing_check(){
        return
                driver.findElement(By.xpath(WEB_DEVELOPING_CHECK)).getText();
    }

    public void application_developing(){
        driver.findElement(By.xpath(ALL_COURSES_MAIN_PAGE)).click();
        driver.findElement(By.xpath(APPLICATION_DEVELOPING)).click();
    }

    public String application_developing_check(){
        return
                driver.findElement(By.xpath(APPICATION_DEVELOPING_CHECK)).getText();
    }
    public void games_developing(){
        driver.findElement(By.xpath(ALL_COURSES_MAIN_PAGE)).click();
        driver.findElement(By.xpath(GAMES_DEVELOPING)).click();

    }
    public String games_developing_check(){
        return
                driver.findElement(By.xpath(GAMES_DEVELOPING_CHECK)).getText();
    }
    public void security_courses(){
        driver.findElement(By.xpath(ALL_COURSES_MAIN_PAGE)).click();
        driver.findElement(By.xpath(SECURITY_COURSES)).click();
    }
    public String security_courses_check(){
        return
                driver.findElement(By.xpath(SECURITY_COURSES_CHECK)).getText();
    }
    public void it_without_code_courses(){
        driver.findElement(By.xpath(ALL_COURSES_MAIN_PAGE)).click();
        driver.findElement(By.xpath(IT_WITHOUT_CODE)).click();
    }
    public String it_without_code_courses_check(){
        return
                driver.findElement(By.xpath(IT_WITHOUT_CODE_CHECK)).getText();
    }

    public void marketing_courses(){
        driver.findElement(By.xpath(ALL_COURSES_MAIN_PAGE)).click();
        driver.findElement(By.xpath(MARKETING_COURSES)).click();
    }
    public String marketing_courses_check(){
        return
                driver.findElement(By.xpath(MARKETING_COURSES_CHECK)).getText();
    }
    public void management_courses(){
        driver.findElement(By.xpath(ALL_COURSES_MAIN_PAGE)).click();
        driver.findElement(By.xpath(MANAGEMENT_COURSES)).click();
    }
    public String management_courses_check(){
        return
                driver.findElement(By.xpath(MANAGEMENT_COURSES_CHECK)).getText();
    }

    public void subscribe_news_it_incorrect_email(){
        driver.findElement(By.xpath(SUBSCRIBE_NEWS_IT)).sendKeys("fjff.fjf@fkfk");
        driver.findElement(By.xpath(SUBSCRIBE_NEWS_IT_BUTTON)).click();
    }
    public String subscribe_it_news_incorrect_email_check(){
        return
                driver.findElement(By.xpath(SUBSCRIBE_NEWS_IT_ERROR_MESSAGE)).getText();
    }

    public void try_courses_incorrect_email(){
        driver.findElement(By.xpath(PROGRAMMING_MAIN_PAGE)).click();
        driver.findElement(By.xpath(PYTHON_COURSES)).click();
    }
    public void choose_python_developer(){
        driver.findElement(By.xpath(PYTHON_DEVELOPER)).click();
    }
    public void sign_up_for_a_course_button(){
        driver.findElement(By.xpath(SIGN_UP_FOR_A_COURSE_BUTTON)).click();
    }
    public void sign_up_for_a_course_name(){
        driver.findElement(By.xpath(SIGN_UP_FOR_A_COURSE_NAME_FIELD)).sendKeys("Abra Kadabra");
    }

    public void sign_up_for_a_course_email(){
        driver.findElement(By.xpath(SIGN_UP_FOR_A_COURSE_EMAIL_FIELD)).sendKeys("fsdsd@ssdsds");
    }

    public void sign_for_a_course_phone(){
        driver.findElement(By.xpath(SIGN_UP_FOR_A_COURSE_PHONE_FIELD)).sendKeys("9332344343");
    }
    public void sign_for_a_course_confirm_button(){
        driver.findElement(By.xpath(SIGN_UP_FOR_A_COURSE_CONFIRM_BUTTON)).click();
    }
    public void email_info(){
        driver.findElement(By.xpath(CONTACTS_MAIN_PAGE)).click();
    }
    public Object email_info_check(){
        return
        driver.findElement(By.xpath(INFO_EMAIL_CONTACTS)).getTagName();
        }
        public Object email_boss(){
        return
        driver.findElement(By.xpath(EMAIL_BOSS_SF)).getTagName();
        }

}





