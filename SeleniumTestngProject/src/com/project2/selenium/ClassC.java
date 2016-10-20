package com.project2.selenium;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassC {

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

}
