package com.selenium.project.pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightListPage {

	WebDriver driver;
	
	private By searchedflightList=By.xpath("//*[@id='flightListResult' and @valign='top']/div");
	
	public FlightListPage(WebDriver driver){
		this.driver=driver;
	}
	
	public int countNoOfFlights(){
		
		List<WebElement> fltList=driver.findElements(searchedflightList);
		return fltList.size();
	}
	public boolean checkFlightListCount(){
		int count=countNoOfFlights();		
		return (count>0&&count<100);
		
	}
	public void takeScreenShot() throws IOException, InterruptedException{
		File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(screenshotFile, new File("E:\\Assigmts\\Screenshot\\IRCTC_Screen_Shot2.png"));
		Thread.sleep(4000);
	}
	
}
