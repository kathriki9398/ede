package modi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DD {
	
	
	
	
		
		WebDriver driver;
		
	@Test
		public void ram() {
			
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tendable.com/");
			
			
		
			
			
			
		List<String>list= (List<String>) driver.findElement(By.xpath("//body/header[@class='w-full sticky top-0 z-1000']/div[@class='flex flex-wrap items-center justify-between w-full max-w-10xl mx-auto']/nav[@id='main-navigation-new']/ul/li[1]"));
			
		
		
		for(String lis:list) {
			
			System.out.println(lis);
		}
		}
			
}
