package com.qa.Testcases;



import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.qa.pages.HomePage;

import com.qa.TestBase.TestBase;


public class HomePageTest extends TestBase {

	HomePage homepage;
	

	

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeClass
	public void setUp() {
		initialization();
		System.out.println("Browser has launched");
		homepage=new HomePage();
		
		
		
	}
	
	
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
	String homePageTitle = homepage.validateLoginPageTitle();
	System.out.println(homePageTitle);
		Assert.assertEquals(homePageTitle, "CRMPRO Log In Screen");
		System.out.println("validated logintitle test");
	}
	
	@Test(priority=2)
	public void LoginTest()
	{
		
		homepage.login();
		System.out.println("Login page is validated");
	}
//	
//	@Test(priority=2)
//	public void verifyUserNameTest(){
//		testUtil.switchToFrame();
//		Assert.assertTrue(homepage.verifyCorrectUserName());
//	}
//	
//	@Test(priority=3)
//	public void verifyContactsLinkTest(){
//		testUtil.switchToFrame();
//		contactsPage = homepage.clickOnContactsLink();
//	}
	
	
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	

}