package modi;

import java.util.List;
import java.util.Set;

import org.apache.hc.core5.util.Asserts;
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

public class SS {
	
	WebDriver driver;
	
	@BeforeClass
	public void ram() {
		
	WebDriverManager.chromedriver().setup();
	
	driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.tendable.com/");
		
		
	}
	
	//@Test(priority=1)
	public void method1() throws InterruptedException {
		
		
		
		String parent= driver.getWindowHandle();
		driver.findElement(By.id("name")).sendKeys("kathriki");
		Thread.sleep(2000);
		
		System.out.println("parnewindow"+parent+driver.getTitle()
				);
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		
		Set<String > child= driver.getWindowHandles();
		
		for(String childs:child) {
			
			if(!childs.equals(parent)) {
				
			
			
			driver.switchTo().window(childs);
			driver.manage().window().maximize();
			
			driver.findElement(By.id("firstName")).sendKeys("ramanji");
			System.out.println("child window"+childs+ driver.getTitle());
			Thread.sleep(2000);
			driver.close();
		}}
		
	driver.switchTo().window(parent);
	
WebElement ram=driver.findElement(By.id("name"));
ram.clear();
ram.sendKeys("kathrikivanitha");
Thread.sleep(2000);



	}
	
	//@Test(priority=2)
	public void window() throws InterruptedException {
		
		driver.findElement(By.id("name")).sendKeys("kathriki");
		Thread.sleep(2000);
		
		
		String parent= driver.getWindowHandle();
		System.out.println("paretn "+parent+driver.getTitle());
		driver.findElement(By.id("newTabBtn")).click();
		
		
		Set<String> child= driver.getWindowHandles();
		
		
		for(String childs:child) {
			
			if(!childs.equals(parent)) {
				
				driver.switchTo().window(childs);
			
			driver.manage().window().maximize();
			
				driver.findElement(By.id("alertBox")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
			System.out.println(driver.findElement(By.id("output")));
			System.out.println("child windo"+childs);
			}
		}
		driver.switchTo().window(parent);
		
		driver.findElement(By.id("name")).sendKeys("manikie");
		
	}
	
	
//	@Test(priority=1)
	public void frame() {
		
		
		driver.findElement(By.id("name")).sendKeys("kathrikI");
		
		driver.switchTo().frame("frm1");
		Select ram= new Select(driver.findElement(By.id("course")));
		ram.selectByIndex(2);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("12344");
		
		driver.switchTo().frame("frm2");
		
		
		driver.findElement(By.id("firstName")).sendKeys("kriak");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm1");
		
		ram.selectByIndex(3);
		
		
		
		
		
	}
	
	@Test
	public void fram2() {
		
		

		driver.findElement(By.id("name")).sendKeys("kathrikI");
		
		driver.switchTo().frame("frm2");
		
		driver.findElement(By.id("firstName")).sendKeys("1242");
		
		driver.findElement(By.id("femalerb")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("name")).clear();
		
		driver.findElement(By.id("name")).sendKeys("mani");
		
		
		
	}
	
	@Test
	public void ramew() {
		
		
		
		
		
	List<String>list= (List<String>) driver.findElement(By.xpath("//body/header[@class='w-full sticky top-0 z-1000']/div[@class='flex flex-wrap items-center justify-between w-full max-w-10xl mx-auto']/nav[@id='main-navigation-new']/ul/li[1]"));
		
	
	
	for(String lis:list) {
		
		System.out.println(lis);
	}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
