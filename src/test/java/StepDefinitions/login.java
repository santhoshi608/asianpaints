package StepDefinitions;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import Login_PageFactory.LoginPage;
import Login_PageFactory.OutlinePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	
	WebDriver driver;
	
	
//	secnario 1
	
	
	@Given("I am on the Asian Paints login page")
	public void i_am_on_the_asian_paints_login_page() throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://www.asianpaints.com/");
        String winHandle = driver.getWindowHandle();
        Thread.sleep(1000);
        driver.switchTo().frame(3);
        driver.findElement(By.xpath("//input[@id='__st_bpn_yes']")).click();
        driver.switchTo().window(winHandle);
        driver.findElement(By.id("profileholder")).click();
  	    Thread.sleep(1000);

	}

	@When("I enter valid Phone number")
	public void i_enter_valid_phone_number() throws InterruptedException {
		
        LoginPage lp = new LoginPage(driver);
		lp.mobile_num();
		
	}

	@When("click on the submit button")
	public void click_on_the_submit_button() throws InterruptedException {	
		
		LoginPage lp = new LoginPage(driver);
		lp.mobilebutton();
	}

	@When("I enter valid OTP")
	public void i_enter_valid_otp() throws InterruptedException {
		
       LoginPage lp = new LoginPage(driver);
		lp.otp();
		lp.otp_button();
	    


	}

	@Then("I should redirect to the home page")
	public void i_should_redirect_to_the_home_page() {  
		
		WebElement head = driver.findElement(By.xpath("//*[@id=\"loginDropdown\"]/div/ul/li[1]"));
	    String value = head.getText();
	    SoftAssert as = new SoftAssert();
	    as.assertEquals(value,"Hello! Reddi");
	    System.out.println(value);
		
		
	}

	
	
//	scenario 2
	
	
	
	@When("I enter invalid Phone number")
	public void i_enter_invalid_phone_number() throws InterruptedException {

       LoginPage lp = new LoginPage(driver);
	   lp.mobile_num1();
	   lp.mobilebutton();

	}

	@Then("I should see an error message indicating Phone number is invalid")
	public void i_should_see_an_error_message_indicating_phone_number_is_invalid() {
		
		WebElement head = driver.findElement(By.xpath("//*[@id=\"validate-mobile\"]/div[1]/div"));
	    String value = head.getText();
	    SoftAssert as = new SoftAssert();
	    as.assertEquals(value,"Phone number is invalid");
	    System.out.println(value);
		
		
		
	    
	}

	
//	scenario 3
	
	@When("I enter the invalid OTP")
	public void i_enter_the_invalid_otp() throws InterruptedException {
	    

        LoginPage lp = new LoginPage(driver);
        lp.mobile_num();
		lp.mobilebutton();
        lp.otp();
		lp.otp_button();
	  


	}

	@Then("I should see an error message indicating Invalid or expired OTP.please try again!")
	public void i_should_see_an_error_message_indicating_invalid_or_expired_otp_please_try_again() { 
		
		WebElement head = driver.findElement(By.xpath("//*[@id=\"validate-register\"]/div[5]"));
	    String value = head.getText();
	    SoftAssert as = new SoftAssert();
	    as.assertEquals(value,"Invalid or expired OTP, please try again!");
	    System.out.println(value);
		
	}
	
	
	
	
//	scenario 4
	
	@When("I enter phone number as a new user")
	public void i_enter_phone_number_as_a_new_user() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.newmobile_num();
	    


	}

	@When("click on submit button")
	public void click_on_submit_button() throws InterruptedException {
		
        LoginPage lp = new LoginPage(driver);
		lp.mobilebutton();

	}

	
	@Then("I should be redirected to the register page")
	public void i_should_be_redirected_to_the_register_page() { 
		
		WebElement head = driver.findElement(By.xpath("//*[@id=\"registerModal\"]/div/div/div[2]/h2"));
	    String value = head.getText();
	    SoftAssert as = new SoftAssert();
	    as.assertEquals(value,"Register");
	    System.out.println(value);
		
		
		
	}

	
	//Scenario 5
	@Given("I am on the Asian paints login page")
	public void i_am_on_the_asian_paints_login_page1() throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://www.asianpaints.com/");
        String winHandle = driver.getWindowHandle();
        Thread.sleep(1000);
        driver.switchTo().frame(3);
        driver.findElement(By.xpath("//input[@id='__st_bpn_yes']")).click();
        driver.switchTo().window(winHandle);
        driver.findElement(By.id("profileholder")).click();
  	    Thread.sleep(1000);
	}


	@Then("I enter name as {string}")
	public void i_enter_name_as(String string) throws InterruptedException {
		
		
		OutlinePage op=new OutlinePage(driver);
		op.enter_name(string);
		

	}

	@Then("I enter mail as {string}")
	public void i_enter_mail_as(String string) throws InterruptedException {
		
		OutlinePage op=new OutlinePage(driver);
		op.enter_email(string);

	}

	@Then("I enter otp as {string}")
	public void i_enter_otp_as(String string) throws InterruptedException {
		
		OutlinePage op=new OutlinePage(driver);
		op.enter_otp(string);
		op.cross();
		op.enter_submit();

	}

	@Then("login should be unsuccessful")
	public void login_should_be_unsuccessful() throws InterruptedException {

		WebElement head = driver.findElement(By.xpath("//*[@id=\"validate-register\"]/div[5]"));
	    String value = head.getText();
	    SoftAssert as = new SoftAssert();
	    as.assertEquals(value,"Invalid or expired OTP, please try again!");
	    System.out.println(value);
		
	}


}
	