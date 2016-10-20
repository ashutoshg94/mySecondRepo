package com.selenium.project.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IrctcLoginPage {

	//locators
	WebDriver driver;
	
	private By flightTickets=By.linkText("Flight Tickets");
	
	public IrctcLoginPage(WebDriver driver){
		this.driver=driver;
	}
		
	public void clickOnFlightTickets(){
		driver.findElement(flightTickets).click();
	}
	
	public void switchToNextPage(){
		Set<String> allWindow=driver.getWindowHandles();
		for(String s:allWindow){
			driver.switchTo().window(s);
			String secondWind =s;
			if(driver.getTitle().equals("IRCTC, Flight Ticket, Air Ticket, Cheap Flight, Low Fare Flight, Online Booking, Flight,Hotel")){
				break;
			}
		}
	}
	
}