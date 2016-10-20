package com.package1.selenium;


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

public class ClassA {

	@Test
	public void m1CA(){
		
		System.out.println("test_case1 of classA");
		//WebDriver driver=new FirefoxDriver();
		
	}
	@Test
	public void m2CA(){
		
		System.out.println("test_case2 of classA");
		//WebDriver driver=new FirefoxDriver();
		
	}
	
	@BeforeMethod
    public void m3CA(){
		
		System.out.println("before method1 of classA");
	}
	@BeforeSuite
    public void m4CA(){
		
		System.out.println("before suite of classA");
	}
	@BeforeTest
    public void m5CA(){
		
		System.out.println("before Test1 of classA");
	}
	@BeforeTest
    public void m6CA(){
		
		System.out.println("before Test2 of classA");
	}
	@BeforeClass
    public void m7CA(){
		
		System.out.println("before Class1 of classA");
	}
	@BeforeClass
    public void m8CA(){
		
		System.out.println("before Class2 of classA");
	}
	@BeforeMethod
    public void m9CA(){
		
		System.out.println("before methode2 of classA");
	}
	@AfterMethod
    public void m10CA(){
		
		System.out.println("after methode1 of classA");
	}
	@AfterMethod
    public void m11CA(){
		
		System.out.println("after methode2 of classA");
	}
	@AfterTest
    public void m12CA(){
		
		System.out.println("after test1 of classA");
	}
	@AfterClass
    public void m13CA(){
		
		System.out.println("after class of classA");
	}
	@AfterSuite
    public void m14CA(){
		
		System.out.println("after Suite of classA");
	}
	@AfterTest
    public void m15CA(){
		
		System.out.println("after test2 of classA");
	}
}
