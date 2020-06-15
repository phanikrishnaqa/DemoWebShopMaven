package com.demoworkshop.qa.Test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoworkshop.qa.TestBase;
import com.demoworkshop.qa.pages.DemoWorkShop_Books_Page;
import com.demoworkshop.qa.pages.DemoWorkShop_Digital_Downloads_Page;
import com.demoworkshop.qa.pages.DemoWorkShop_Electronics_Page;
import com.demoworkshop.qa.pages.DemoWorkShop_Gift_Cards_Page;
import com.demoworkshop.qa.pages.DemoWorkShop_HomePage;
import com.demoworkshop.qa.pages.DemoWorkShop_SignIn;
import com.demoworkshop.util.DemoWorkShop_Listener;

@Listeners(DemoWorkShop_Listener.class)
public class DemoWorkShop_End_To_End extends TestBase {
	
	DemoWorkShop_HomePage DemoWorkShop_HomePage;
	DemoWorkShop_SignIn DemoWorkShop_SignIn;
	DemoWorkShop_Books_Page DemoWorkShop_Books_Page;
	DemoWorkShop_Electronics_Page DemoWorkShop_Electronics_Page;
	DemoWorkShop_Digital_Downloads_Page Digital_Downloads_Page;
	DemoWorkShop_Gift_Cards_Page DemoWorkShop_Gift_Cards_Page;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
		try {
			init();
			DemoWorkShop_SignIn = new DemoWorkShop_SignIn();
			DemoWorkShop_HomePage = new DemoWorkShop_HomePage();
			DemoWorkShop_Books_Page = new DemoWorkShop_Books_Page();
			DemoWorkShop_Electronics_Page = new DemoWorkShop_Electronics_Page();
			Digital_Downloads_Page = new DemoWorkShop_Digital_Downloads_Page();
			DemoWorkShop_Gift_Cards_Page = new DemoWorkShop_Gift_Cards_Page(); 
			
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	@BeforeClass
	public void beforeClass() {
		 System.out.println("Before Class");
	}
 
	@BeforeTest
	public void beforeTest() {
		 System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		
	}
  
	@Test(priority=1, testName="TC001_LoginToDemoWebshop")
	public void TC001_LoginToDemoWebshop() {
		extentTest = extentRep.startTest("TC001_LoginToDemoWebshop");
		DemoWorkShop_SignIn.DemoWorkShopSignIn();
	
	}
	
	@Test(priority=2, testName="TC002_Verify_Demowebshop_Homepage_IsDisplayed")
	public void TC002_Verify_Demowebshop_Homepage_IsDisplayed() {
		 extentTest = extentRep.startTest("TC002_Verify_Demowebshop_Homepage_IsDisplayed"); 
		  DemoWorkShop_HomePage.DemoWorkShop_Homepage("Tricentis Demo Web Shop");
	  }
  
	@Test(priority=3, testName="TC003_Books_link")
    public void TC003_Books_link() {
		
		extentTest = extentRep.startTest("TC001_LoginToDemoWebshop");
		DemoWorkShop_SignIn.DemoWorkShopSignIn();
		
		extentTest = extentRep.startTest( "Clicking on Books link is sucessfull");
		DemoWorkShop_Books_Page.Click_Books_Link("Books");
		
		
		extentTest= extentRep.startTest("Selecting Computer Internet Book is sucessfull");
		DemoWorkShop_Books_Page.Click_Computing_Internet_Book_Img();
		
		extentTest= extentRep.startTest("Selecting Fiction Book is sucessfull");
		DemoWorkShop_Books_Page.Click_Fiction_Book_Img();
		
		extentTest= extentRep.startTest("Selecting Health Book is sucessfull");
		DemoWorkShop_Books_Page.Click_Health_Book_Img();
		
		extentTest= extentRep.startTest("Selecting Science Book is sucessfull");
		DemoWorkShop_Books_Page.Click_Science_Book_Img();
		
	}
  
	@Test(priority=4, testName="TC004_Electronics_page")
	public void TC004_Electronics_page() {
		
		extentTest= extentRep.startTest("Signin to Demo web shop is sucessfull");
		DemoWorkShop_SignIn.DemoWorkShopSignIn();
		
		extentTest= extentRep.startTest("Signin to Demo web shop is sucessfull");
		DemoWorkShop_Electronics_Page.Click_Electronics_page("Electronics");
		
		extentTest= extentRep.startTest("Clicking on Books link is sucessfull");
		DemoWorkShop_Electronics_Page.Click_Camera_Photo_page("Camera, photo");
		
		extentTest= extentRep.startTest("Selecting Computer Internet Book is sucessfull");
		DemoWorkShop_Electronics_Page.Click_Cell_Phones_page("Cell phones");
		
		extentTest= extentRep.startTest("Selecting Fiction Book is sucessfull");
		DemoWorkShop_Electronics_Page.Click_Cell_Phones_Cover_Page();
		
		extentTest= extentRep.startTest("Selecting Health Book is sucessfull");
		DemoWorkShop_Electronics_Page.Click_SmartPhone_Page();
		
		extentTest= extentRep.startTest("Selecting Science Book is sucessfull");
		DemoWorkShop_Electronics_Page.Used_Phones_Page();
		
	}
  
	@Test(priority=5, testName="TC005_Digital_Downloads_page")
	public void TC005_Digital_Downloads_page() {
		
		extentTest= extentRep.startTest("Signin to Demo web shop is sucessfull");
		DemoWorkShop_SignIn.DemoWorkShopSignIn();
		
		extentTest= extentRep.startTest("Signin to Demo web shop is sucessfull");
		Digital_Downloads_Page.Digital_Downloads_page("Digital downloads");
		
		extentTest= extentRep.startTest("Clicking on Books link is sucessfull");
		Digital_Downloads_Page.Click_3rd_Album_Img();
		
		extentTest= extentRep.startTest("Selecting Computer Internet Book is sucessfull");
		Digital_Downloads_Page.Click_Music2_1st_Release_Img();
		
		extentTest= extentRep.startTest("Selecting Fiction Book is sucessfull");
		Digital_Downloads_Page.Click_Music2_2st_Release_Img();
		
	}
	
	@Test(priority=6, testName="TC006_DemoWorkShop_Gift_Cards_Page")
	public void TC006_DemoWorkShop_Gift_Cards_Page() {
		
		extentTest= extentRep.startTest("Signin to Demo web shop is sucessfull");
		DemoWorkShop_SignIn.DemoWorkShopSignIn();
		
		extentTest= extentRep.startTest("Signin to Demo web shop is sucessfull");
		DemoWorkShop_Gift_Cards_Page.Click_Gift_Cards_Link("Gift Cards");
		
		extentTest= extentRep.startTest("Clicking on Books link is sucessfull");
		DemoWorkShop_Gift_Cards_Page.Click_$100_Physical_Gift_Card_Link();
		
		extentTest= extentRep.startTest("Selecting Computer Internet Book is sucessfull");
		DemoWorkShop_Gift_Cards_Page.Click_$25_Virtual_Gift_Card_Link();
		
		extentTest= extentRep.startTest("Selecting Fiction Book is sucessfull");
		DemoWorkShop_Gift_Cards_Page.Click_$5_Virtual_Gift_Card_Link();
		
		extentTest= extentRep.startTest("Selecting Fiction Book is sucessfull");
		DemoWorkShop_Gift_Cards_Page.Click_$50_Physical_Gift_Card_Link();
		
	}
 
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method"); 
  } 

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test"); 
	  extentRep.flush();
	  extentRep.close(); 
  }
  
  @AfterClass
  public void AfterClass() {
		 System.out.println("After Class");
		
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
		driver.quit();
	}

}
