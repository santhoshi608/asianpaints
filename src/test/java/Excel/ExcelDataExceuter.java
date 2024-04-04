package Excel;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class ExcelDataExceuter {
	@Test(dataProvider = "search", dataProviderClass = ExcelDataReader.class)
    public void TestExcel(String search) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
        	driver.manage().window().maximize();
            driver.get("https://www.asianpaints.com/");
            WebElement colname = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[11]/div/div/div/div[1]/div/div/div[2]/div/div/div/div/form/div/div[2]/input"));
            

            colname.sendKeys(search);
           Thread.sleep(3000);
 
            WebElement searchs = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[11]/div/div/div/div[1]/div/div/div[2]/div/div/div/div/form/div/div[2]/button"));
            searchs.click();
            Thread.sleep(3000);
        } 
        finally {
            driver.quit();
        }
    }
 
}
