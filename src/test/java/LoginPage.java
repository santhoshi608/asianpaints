import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class LoginPage {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://www.asianpaints.com/");
        String winHandle = driver.getWindowHandle();
        Thread.sleep(1000);
        driver.switchTo().frame(3);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@id='__st_bpn_yes']")).click();
        driver.switchTo().window(winHandle);
  	    driver.findElement(By.id("profileholder")).click();
  	    Thread.sleep(1000);
  	    driver.findElement(By.xpath("//*[@id=\"loginMobile\"]")).sendKeys("6300367528");
  	  Thread.sleep(1000);
  	    driver.findElement(By.xpath("//button[@class='ctaText modal__variant-login--submit']")).click();
 
  	  Scanner sc = new Scanner(System.in);
  	  System.out.println("Enter the OTP: ");
  	  String user = sc.nextLine();
  	  driver.findElement(By.id("loginOtp")).sendKeys(user);
  	  Thread.sleep(1000);
  	 driver.findElement(By.xpath("//*[@id=\"validate-otp\"]/div[3]")).click();
  	  //driver.findElement(By.className("ctaText validate-login  modal__variant-login--submit")).click();
	}
}

