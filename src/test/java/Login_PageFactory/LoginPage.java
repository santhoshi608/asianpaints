package Login_PageFactory;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     WebDriver driver;
     public LoginPage(WebDriver driver) {
    	 this.driver=driver;
    	 PageFactory.initElements(driver,this);
     }
     
     @FindBy(id="profileholder")
     WebElement profile_holder;
     
     @FindBy(xpath="//*[@id=\"loginMobile\"]")
     WebElement mobile_num;
     
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div/div[2]/div/div[1]/div/div/div[2]/form/div[2]")
	WebElement mobilebutton;
	
	@FindBy(xpath="//input[@id='loginOtp']")
	WebElement otp;
	
	@FindBy(xpath="//button[@class='ctaText validate-login  modal__variant-login--submit']")
	
	WebElement otp_button;
	
	
	
	public void profile_holder() throws InterruptedException {
		profile_holder.click();
		Thread.sleep(2000);
	}
	
	public void mobile_num() throws InterruptedException{
		mobile_num.sendKeys("6300367528");
		Thread.sleep(1000);
	}
	public void mobilebutton() throws InterruptedException {
		mobilebutton.click();
Thread.sleep(1000);
		
	}
	public void otp() throws InterruptedException {
		
		
		Scanner sc = new Scanner(System.in);
	  	 System.out.println("Enter the OTP: ");
	  	 String otp= sc.nextLine();
	  	 driver.findElement(By.id("loginOtp")).sendKeys(otp);
	  	 Thread.sleep(1000);
		
	}
	public void otp_button(){
		otp_button.click();
	}
	public void mobile_num1() throws InterruptedException {
		mobile_num.sendKeys("99887766");
		Thread.sleep(1000);
	}
	
	public void newmobile_num() throws InterruptedException {
		mobile_num.sendKeys("7671974462");
		Thread.sleep(1000);
		
		
	}
	
	
	
	
	
}
