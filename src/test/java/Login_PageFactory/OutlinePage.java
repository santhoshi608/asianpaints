package Login_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OutlinePage {
	
	WebDriver driver;
    public OutlinePage(WebDriver driver) {
   	 this.driver=driver;
   	 PageFactory.initElements(driver,this);
    }
    
    @FindBy(id="registerName")
    WebElement enter_name;
    
    @FindBy(id="registerEmail")
    WebElement enter_email;
    
    @FindBy(id="registerOtp")
    WebElement enter_otp;
    
    @FindBy(xpath="/html/body/div[4]/div[2]/div/div[2]/button")
    
    WebElement cross;
    
    
    
    
   @FindBy(xpath="/html/body/div[1]/div/div[3]/div/div[2]/div/div[3]/div/div/div[2]/form/div[6]")
    WebElement enter_submit;
    
    
    public void enter_name(String string) throws InterruptedException {
    	Thread.sleep(1000);
    	enter_name.sendKeys(string);
    	Thread.sleep(1000);
    }
    
    public void enter_email(String string) throws InterruptedException {
    	
    	enter_email.sendKeys(string);
    	Thread.sleep(1000);
    }
    
    public void enter_otp(String string) throws InterruptedException {
    	
    	enter_otp.sendKeys(string);
    	Thread.sleep(1000);
    }

    public void cross() throws InterruptedException {
	Thread.sleep(2000);
	cross.click();
	Thread.sleep(3000);
}
    
     public void enter_submit() {
	
	enter_submit.click();
}
     
     
     
     
    
}
