package org.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon1 {
	
	
	@DataProvider(name="Amazon1")
	public Object[]getData() {
		return new Object[] {
		("samsung s2"),("puma tshirt"),("mi mobile"),("iphone 11"),("lava mobile"),("oppo mobile"),(" samsung laptop"),("hp laptop"),("mi 7pro")
		
		};
}
@Test(dataProvider="Amazon1")
private void tc01(String s) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys(s);	
	
	WebElement btn = driver.findElement(By.id("nav-search-submit-button"));
	btn.click();
	driver.close();
		
	}


}