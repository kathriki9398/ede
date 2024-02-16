package modi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SS {
	
	
	@Test
	public void ram() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tendable.com/contact-us");
		
		 List<WebElement> topMenus = driver.findElements(By.xpath("//a[normalize-space(text()='Request A Demo')]"));
		 
		 System.out.println(driver.findElements(By.xpath("//a[normalize-space(text()='Request A Demo')]")));
	        
//		driver.findElement(By.xpath("//a[@class='button inverted is-active']")).click();
//		
//		driver.findElement(By.xpath("(//div[@class='flex flex-wrap w-full items-center justify-center mt-6'])[1]")).click();
//		
//		driver.findElement(By.id("form-input-fullName")).sendKeys("kathri");
//		
//		driver.findElement(By.id("form-input-organisationName")).sendKeys("Creative Softech Pvt Ltd");
//		
//		driver.findElement(By.id("form-input-cellPhone")).sendKeys("7676256706");
//		
//		driver.findElement(By.id("form-input-email")).sendKeys("kramanji9398@gmail.com");
//		
//		
//		WebElement ram = driver.findElement(By.id("form-input-jobRole"));
//		Select st = new Select(ram);
//		
//		st.selectByIndex(1);
//		
//		
//		WebElement sa= driver.findElement(By.id("form-input-consentAgreed-0"));
//		
//		sa.click();
//		
//		driver.findElement(By.xpath("//button[contains(@data-loading-text,'Loading...')][normalize-space()='Submit']")).click();
//	
//		
//		driver.quit();
//		
		
	}

}
