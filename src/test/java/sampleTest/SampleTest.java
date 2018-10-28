package sampleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void sample() throws IOException, InterruptedException {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		WebElement input = wd.findElement(By.xpath("html/body/table/tbody/tr/td/div/div[2]/div[2]/form/div[1]/input[1]"));
		input.sendKeys("ABC");
		input.submit();
		Thread.sleep(2000);
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\SeleniumWorkspace\\GITHubTest\\Screenshot\\sample.jpeg"));
		
		System.out.println("Test1");
		System.out.println("Test2");
		

	}

}
