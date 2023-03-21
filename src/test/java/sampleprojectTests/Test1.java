package sampleprojectTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.base;

public class Test1 extends base{

	
	
	
	
	@Test
	public void launchURL() {
		driver.findElement(By.xpath(""));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
