package modi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mavin {
	
	

	private WebDriver driver;

    @BeforeClass
    public void setUp() {
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tendable.com");
    }

    @Test(priority = 1)
    public void testTopLevelMenusAccessibility() {
WebElement home=driver.findElement(By.xpath("//a[normalize-space()='Our Story']"));
		
		WebElement oursolutin= driver.findElement(By.xpath("//a[normalize-space()='Our Solution']"));
		WebElement tendar= driver.findElement(By.xpath("//a[normalize-space()='Why Tendable?']"));
		

		
		Assert.assertTrue(home.isDisplayed() && home.isEnabled(), "Our Solution");
		Assert.assertTrue(home.isDisplayed() && home.isEnabled(), "Our Story");
		Assert.assertTrue(home.isDisplayed() && home.isEnabled(), "Why Tendable");

                
    }

    @Test(priority = 2)
    public void testRequestDemoButtonPresence() {
        
        List<WebElement> topMenus = driver.findElements(By.xpath("//a[normalize-space(text()='Request A Demo')]"));
        for (WebElement menu : topMenus) {
            menu.click();
            WebElement requestDemoButton = driver.findElement(By.cssSelector(".btn-request-demo"));
            Assert.assertTrue(requestDemoButton.isDisplayed() && requestDemoButton.isEnabled(), "Request Demo button is not present or active");
        }
    }

    @Test(priority = 3)
    public void testContactUsFormErrorMessage() throws InterruptedException {
        // Navigate to Contact Us section and submit form with missing Message field

		
		driver.findElement(By.xpath("//a[@class='button inverted is-active']")).click();
		
		driver.findElement(By.xpath("(//div[@class='flex flex-wrap w-full items-center justify-center mt-6'])[1]")).click();
		
		driver.findElement(By.id("form-input-fullName")).sendKeys("kathri");
		
		driver.findElement(By.id("form-input-organisationName")).sendKeys("Creative Softech Pvt Ltd");
		
		driver.findElement(By.id("form-input-cellPhone")).sendKeys("7676256706");
		
		driver.findElement(By.id("form-input-email")).sendKeys("kramanji9398@gmail.com");
		
		
		WebElement ram = driver.findElement(By.id("form-input-jobRole"));
		Select st = new Select(ram);
		
		st.selectByIndex(1);
		
		
		WebElement sa= driver.findElement(By.id("form-input-consentAgreed-0"));
		
		sa.click();
		driver.findElement(By.xpath("//button[contains(@data-loading-text,'Loading...')][normalize-space()='Submit']")).click();
		
        WebElement errorMessage = driver.findElement(By.xpath("//p[normalize-space()='Sorry, there was an error submitting the form. Please try again.']"));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed for missing Message field");
    }

    
    @AfterClass
  public void tearDown() {
	  if(driver!=null) {
		  
		  driver.quit();
		  
	  }
	  
  }

}
