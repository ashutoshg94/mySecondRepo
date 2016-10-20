package com.selenium.project.tests;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.selenium.project.pages.FlightListPage;
import com.selenium.project.pages.IrctcFlightSearchPage;
import com.selenium.project.pages.IrctcLoginPage;

public class IrctcLoginTest {

	
	WebDriver driver=new FirefoxDriver();
	String firstWind;	
	@Test
	public void test() throws InterruptedException, IOException{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/");
		
		firstWind=driver.getWindowHandle();
		IrctcLoginPage loginObject=new IrctcLoginPage(driver);
		loginObject.clickOnFlightTickets();				
		loginObject.switchToNextPage();		
		//assertion
		String url=driver.getCurrentUrl();
		System.out.println(url.contains("air")+"  "+"URL:"+url);
		Assert.assertTrue(url.contains("air"));
		IrctcFlightSearchPage fltSearch=new IrctcFlightSearchPage(driver);
		boolean b1=fltSearch.checkOneWayButtonIsSelected();
		System.out.println("One Way isSelected:"+b1);
		Assert.assertTrue(b1);
		boolean b2=fltSearch.checkOneWayButtonIsSelected();
		System.out.println("Round Trip isSelected:"+b2);
		Assert.assertTrue(b2);
		fltSearch.setFromCity("Delhi");
		fltSearch.toCity("Jaipur");
		fltSearch.selectDepartureDate();
		fltSearch.setNoOfAdultPassengers();
		fltSearch.setNoOfChildPassengers();
		fltSearch.clickOnSearchFlight();
		
		FlightListPage fltList=new FlightListPage(driver);
		System.out.println("Total no of flights available="+fltList.countNoOfFlights());
				
		boolean b3=fltList.checkFlightListCount();
		System.out.println("assertion for flight List:"+b3);
		Assert.assertTrue(b3);
		
		fltList.takeScreenShot();
		
		driver.close();
		driver.switchTo().window(firstWind);
		driver.close();
	}
	
	
	/*@AfterMethod
	public void tear() throws InterruptedException{
		Thread.sleep(5000);
		driver.quit();
	}*/
}
