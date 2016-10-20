package com.project2.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassB {

	@Test
	public void m1CB(){
		
		System.out.println("test_case1 of classB");
		//WebDriver driver=new FirefoxDriver();
	}
	@Test
	public void m2CB(){
		
		System.out.println("test_case2 of classB");
		//WebDriver driver=new FirefoxDriver();
	}
	@BeforeMethod
    public void m3CB(){
		
		System.out.println("before method of classB");
	}
	@AfterMethod
    public void m4CB(){
		
		System.out.println("after method of classB");
	}
	@BeforeSuite
    public void m5CB(){
		
		System.out.println("before suite of classB");
	}
	@BeforeClass
    public void m6CB(){
		
		System.out.println("before Class of classB");
	}
	@AfterSuite
    public void m7CB(){
		
		System.out.println("after Suite of classB");
	}
	@BeforeTest
	public void m8CB(){
		System.out.println("Before test of classB");
		
	}
	@AfterTest
	public void m9CB(){
		System.out.println("After test of classB");
		
	}
	@AfterClass
    public void m10CB(){
		
		System.out.println("After Class of classB");
	}
	
}
