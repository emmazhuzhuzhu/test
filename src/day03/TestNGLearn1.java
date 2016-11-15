package day03;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGLearn1 {
	@BeforeTest
	public void beforeTest(){
		 System.out.println("this is before test");
	}
	@BeforeClass
    public void beforeClass() {
        System.out.println("this is before class");
    }
	
	@BeforeMethod
	public void beforeMethod(){
		  System.out.println("this is before method");
	}
	
    @Test
    public void TestNgLearn1() {
        System.out.println("this is TestNgLearn1 test case");
    }
    @Test
    public void TestNgLearn2() {
        System.out.println("this is TestNgLearn2 test case");
    }
    @AfterMethod
	public void afterMethod(){
    	 System.out.println("this is after method");
	}
    @AfterClass
    public void afterClass() {
        System.out.println("this is after class");
    }
    @AfterTest
	public void afterTest(){
		 System.out.println("this is after test");
	}
}
